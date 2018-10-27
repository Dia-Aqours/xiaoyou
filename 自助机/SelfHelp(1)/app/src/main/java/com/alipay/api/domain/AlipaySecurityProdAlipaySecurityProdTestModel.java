/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;

/*  7:   */
/*  8:   */ public class AlipaySecurityProdAlipaySecurityProdTestModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 4327635161972254883L;
/* 12:   */   @ApiListField("cds")
/* 13:   */   @ApiField("string")
/* 14:   */   private List<String> cds;
/* 15:   */   @ApiField("ddd")
/* 16:   */   private String ddd;
/* 17:   */   
/* 18:   */   public List<String> getCds()
/* 19:   */   {
/* 20:33 */     return this.cds;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void setCds(List<String> cds)
/* 24:   */   {
/* 25:36 */     this.cds = cds;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public String getDdd()
/* 29:   */   {
/* 30:40 */     return this.ddd;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setDdd(String ddd)
/* 34:   */   {
/* 35:43 */     this.ddd = ddd;
/* 36:   */   }
/* 37:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipaySecurityProdAlipaySecurityProdTestModel

 * JD-Core Version:    0.7.0.1

 */