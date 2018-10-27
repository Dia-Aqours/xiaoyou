/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.InfoCode;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipaySecurityRiskRainscoreQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 2591541729431655126L;
/* 13:   */   @ApiListField("infocode")
/* 14:   */   @ApiField("info_code")
/* 15:   */   private List<InfoCode> infocode;
/* 16:   */   @ApiListField("label")
/* 17:   */   @ApiField("string")
/* 18:   */   private List<String> label;
/* 19:   */   @ApiField("score")
/* 20:   */   private String score;
/* 21:   */   
/* 22:   */   public void setInfocode(List<InfoCode> infocode)
/* 23:   */   {
/* 24:41 */     this.infocode = infocode;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public List<InfoCode> getInfocode()
/* 28:   */   {
/* 29:44 */     return this.infocode;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setLabel(List<String> label)
/* 33:   */   {
/* 34:48 */     this.label = label;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public List<String> getLabel()
/* 38:   */   {
/* 39:51 */     return this.label;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setScore(String score)
/* 43:   */   {
/* 44:55 */     this.score = score;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public String getScore()
/* 48:   */   {
/* 49:58 */     return this.score;
/* 50:   */   }
/* 51:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipaySecurityRiskRainscoreQueryResponse
 * JD-Core Version:    0.7.0.1
 */