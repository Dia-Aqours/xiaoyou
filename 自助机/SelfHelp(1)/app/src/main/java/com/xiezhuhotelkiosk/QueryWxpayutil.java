package com.xiezhuhotelkiosk;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.Xml;

import com.tencent.mm.sdk.modelpay.PayReq;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.xmlpull.v1.XmlPullParser;

import java.io.StringReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/**
 * Created by Dayfly on 2018/4/23.
 */

public class QueryWxpayutil {


    private Context context;
    PayReq req;
    final IWXAPI msgApi;
    Map<String, String> resultunifiedorder;
    StringBuffer sb;
    private String total_fee;
    private String notify_url;
    private String body;
    private String outTradNo;
    private Handler qmHandler;
    private String trade_state;

    private static final String TAG = "123";
    private String appid;
    private String mchid;
    private String subappid;
    private String submchid;
    private String detail;
    private static String keys= "HW8bmu1U1b4qn0rUfto0rk6Vsf2VjAuf";


    /**
     *
     *   用法：WxPayUtile wxPayUtile = new WxPayUtile(getActivity(),"1","服务器回调地址","产品名称","订单号");
     wxPayUtile.doPay();
     *  @param context   上下文

     * @param outTradNo  定单号
     *          appid
     *
     *
     * @param qmHandler
     */
    public QueryWxpayutil(Context context, String appid, String mchid, String subappid, String submchid, String outTradNo, Handler qmHandler) {
        super();
        msgApi = WXAPIFactory.createWXAPI(context, null);
        req = new PayReq();
        msgApi.registerApp(appid);
        sb = new StringBuffer();
        this.context = context;
        this.appid=appid;
        this.mchid=mchid;
        this.subappid=subappid;
        this.submchid=submchid;
        this.outTradNo = outTradNo;
        this.qmHandler=qmHandler;
    }

//    public static DemoWxpayutil getInstance(Context context, String total_fee,
//                                         String notify_url, String body, String outTradNo,Handler qmHandler) {
//
//        return new DemoWxpayutil(context, total_fee, notify_url, body, outTradNo, qmHandler);
//    }

    public void doPay() {

        QueryWxpayutil.GetPrepayIdTask getPrepayId = new QueryWxpayutil.GetPrepayIdTask();
        getPrepayId.execute();
    }

    /**
     * 生成签名
     */
    private String genPackageSign(List<NameValuePair> params) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < params.size(); i++) {
            sb.append(params.get(i).getName());
            sb.append('=');
            sb.append(params.get(i).getValue());
            sb.append('&');
        }
        sb.append("key=");
        sb.append(keys);
        String packageSign = MD5.getMessageDigest(sb.toString().getBytes())
                .toUpperCase(Locale.CHINA);
//        String packageSign = MD5.getMessageDigest(sb.toString().getBytes())
//                .toUpperCase();
        Log.e("签名-->", packageSign);
        return packageSign;
    }


    private String toXml(List<NameValuePair> params) {
        StringBuilder sb = new StringBuilder();
        sb.append("<xml>");
        for (int i = 0; i < params.size(); i++) {
            sb.append("<" + params.get(i).getName() + ">");

            sb.append(params.get(i).getValue());
            sb.append("</" + params.get(i).getName() + ">");
        }
        sb.append("</xml>");

        Log.e("orion-sb--->", sb.toString());
        return sb.toString();
    }

    private class GetPrepayIdTask extends
            AsyncTask<Void, Void, Map<String, String>> {


        @Override
        protected void onPreExecute() {

//            Toast.makeText(context, "正在准备支付", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onPostExecute(Map<String, String> result) {

            Log.v("------f",""+result.toString());

            if (result.get("result_code").equals("SUCCESS")) {
                Log.v("orion-result_code-->", "IS SUCCESS!");

                trade_state=result.get("trade_state");


                Message msg = Message.obtain();

                msg.what = 200;
                msg.obj = trade_state;

                qmHandler.sendMessage(msg);

//                qmHandler.sendEmptyMessage(100);
//                Log.v("-----result_code-->", code_url);
            }

            if (result.get("result_code").equals("FAIL")) {
                String miaoshuString=result.get("err_code_des");
                Log.v("orion-result_code-->", "IS FAILER!"+miaoshuString);
//                Toast.makeText(context, miaoshuString, Toast.LENGTH_SHORT).show();
            }


        }


        @Override
        protected void onCancelled() {
            super.onCancelled();
//            Toast.makeText(context, "quxiao", Toast.LENGTH_SHORT).show();
        }

        protected Map<String, String> doInBackground(Void... params) {


            String url =  String.format("https://api.mch.weixin.qq.com/pay/orderquery");

            String entity = genProductArgs();

            Log.v("-------entity-->", entity);

            byte[] buf = HttpWxUtile.httpPost(url, entity);
            Log.v("-------buf-->", buf.toString());
            String content = new String(buf);
            Log.v("------content-->", content);
//            Toast.makeText(context, "---"+content, Toast.LENGTH_SHORT).show();
            Map<String, String> xml = decodeXml(content);

            return xml;
        }
    }

    public Map<String, String> decodeXml(String content) {

        try {
            Map<String, String> xml = new HashMap<String, String>();
            XmlPullParser parser = Xml.newPullParser();
            parser.setInput(new StringReader(content));
            int event = parser.getEventType();
            while (event != XmlPullParser.END_DOCUMENT) {

                String nodeName = parser.getName();
                switch (event) {
                    case XmlPullParser.START_DOCUMENT:

                        break;
                    case XmlPullParser.START_TAG:

                        if ("xml".equals(nodeName) == false) {
                            // 实例化student对象
                            xml.put(nodeName, parser.nextText());
                        }
                        break;
                    case XmlPullParser.END_TAG:
                        break;
                }
                event = parser.next();
            }

            return xml;
        } catch (Exception e) {
            Log.v("----orion-e--->", e.toString());
        }
        return null;

    }

    private String genNonceStr() {
        Random random = new Random();
        return MD5.getMessageDigest(String.valueOf(random.nextInt(10000))
                .getBytes());
    }


    private String genProductArgs() {
        StringBuffer xml = new StringBuffer();
        try {
            String nonceStr = genNonceStr();
            xml.append("</xml>");
            List<NameValuePair> packageParams = new LinkedList<NameValuePair>();
            packageParams.add(new BasicNameValuePair("appid", appid));

            packageParams.add(new BasicNameValuePair("mch_id", mchid));
            packageParams.add(new BasicNameValuePair("nonce_str", nonceStr));
            packageParams.add(new BasicNameValuePair("out_trade_no", outTradNo));
            packageParams.add(new BasicNameValuePair("sub_appid", subappid));
            packageParams.add(new BasicNameValuePair("sub_mch_id", submchid));


            String sign = genPackageSign(packageParams);
            packageParams.add(new BasicNameValuePair("sign", sign));
            String xmlstring = toXml(packageParams);
//			return new String(xmlstring.toString().getBytes(), "ISO8859-1");
            return xmlstring;
        } catch (Exception e) {
            Log.v(TAG, "genProductArgs fail, ex = " + e.getMessage());
            return null;
        }

    }


}
