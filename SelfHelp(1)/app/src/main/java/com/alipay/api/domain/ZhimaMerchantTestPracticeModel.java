/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class ZhimaMerchantTestPracticeModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 8181537138141821688L;
/* 12:   */   @ApiListField("add")
/* 13:   */   @ApiField("string")
/* 14:   */   private List<String> add;
/* 15:   */   @ApiField("xxxx")
/* 16:   */   private XXXXsdasdasd xxxx;
/* 17:   */   
/* 18:   */   public List<String> getAdd()
/* 19:   */   {
/* 20:33 */     return this.add;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void setAdd(List<String> add)
/* 24:   */   {
/* 25:36 */     this.add = add;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public XXXXsdasdasd getXxxx()
/* 29:   */   {
/* 30:40 */     return this.xxxx;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setXxxx(XXXXsdasdasd xxxx)
/* 34:   */   {
/* 35:43 */     this.xxxx = xxxx;
/* 36:   */   }
/* 37:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ZhimaMerchantTestPracticeModel
 * JD-Core Version:    0.7.0.1
 */