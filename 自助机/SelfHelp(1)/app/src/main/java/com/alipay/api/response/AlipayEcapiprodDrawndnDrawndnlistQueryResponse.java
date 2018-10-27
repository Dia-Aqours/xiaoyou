/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.DrawndnVo;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;

/*  8:   */
/*  9:   */ public class AlipayEcapiprodDrawndnDrawndnlistQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 1692595913344554954L;
/* 13:   */   @ApiListField("drawndn_list")
/* 14:   */   @ApiField("drawndn_vo")
/* 15:   */   private List<DrawndnVo> drawndnList;
/* 16:   */   @ApiField("request_id")
/* 17:   */   private String requestId;
/* 18:   */   
/* 19:   */   public void setDrawndnList(List<DrawndnVo> drawndnList)
/* 20:   */   {
/* 21:34 */     this.drawndnList = drawndnList;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public List<DrawndnVo> getDrawndnList()
/* 25:   */   {
/* 26:37 */     return this.drawndnList;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setRequestId(String requestId)
/* 30:   */   {
/* 31:41 */     this.requestId = requestId;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getRequestId()
/* 35:   */   {
/* 36:44 */     return this.requestId;
/* 37:   */   }
/* 38:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.AlipayEcapiprodDrawndnDrawndnlistQueryResponse

 * JD-Core Version:    0.7.0.1

 */