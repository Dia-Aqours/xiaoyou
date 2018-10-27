/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.QRcode;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayEcoMycarParkingCardbarcodeCreateResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 4679599391516411188L;
/* 13:   */   @ApiListField("qrcodes")
/* 14:   */   @ApiField("q_rcode")
/* 15:   */   private List<QRcode> qrcodes;
/* 16:   */   
/* 17:   */   public void setQrcodes(List<QRcode> qrcodes)
/* 18:   */   {
/* 19:28 */     this.qrcodes = qrcodes;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<QRcode> getQrcodes()
/* 23:   */   {
/* 24:31 */     return this.qrcodes;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayEcoMycarParkingCardbarcodeCreateResponse
 * JD-Core Version:    0.7.0.1
 */