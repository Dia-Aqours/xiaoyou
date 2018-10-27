/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class InstallmentValue
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 1655858427929658772L;
/* 12:   */   @ApiListField("installment_values")
/* 13:   */   @ApiField("installment_meta_info")
/* 14:   */   private List<InstallmentMetaInfo> installmentValues;
/* 15:   */   
/* 16:   */   public List<InstallmentMetaInfo> getInstallmentValues()
/* 17:   */   {
/* 18:27 */     return this.installmentValues;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void setInstallmentValues(List<InstallmentMetaInfo> installmentValues)
/* 22:   */   {
/* 23:30 */     this.installmentValues = installmentValues;
/* 24:   */   }
/* 25:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InstallmentValue
 * JD-Core Version:    0.7.0.1
 */