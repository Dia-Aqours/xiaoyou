/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class UseRuleInfo
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 7381329225977451165L;
/* 12:   */   @ApiListField("suitable_shops")
/* 13:   */   @ApiField("string")
/* 14:   */   private List<String> suitableShops;
/* 15:   */   @ApiListField("use_mode")
/* 16:   */   @ApiField("string")
/* 17:   */   private List<String> useMode;
/* 18:   */   
/* 19:   */   public List<String> getSuitableShops()
/* 20:   */   {
/* 21:34 */     return this.suitableShops;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setSuitableShops(List<String> suitableShops)
/* 25:   */   {
/* 26:37 */     this.suitableShops = suitableShops;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public List<String> getUseMode()
/* 30:   */   {
/* 31:41 */     return this.useMode;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setUseMode(List<String> useMode)
/* 35:   */   {
/* 36:44 */     this.useMode = useMode;
/* 37:   */   }
/* 38:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.UseRuleInfo
 * JD-Core Version:    0.7.0.1
 */