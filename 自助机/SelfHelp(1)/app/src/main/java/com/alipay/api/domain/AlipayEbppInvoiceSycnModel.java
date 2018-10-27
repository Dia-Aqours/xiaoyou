/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayEbppInvoiceSycnModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 4421224688267142893L;
/* 12:   */   @ApiListField("invoice_info")
/* 13:   */   @ApiField("invoice_model_content")
/* 14:   */   private List<InvoiceModelContent> invoiceInfo;
/* 15:   */   @ApiField("m_short_name")
/* 16:   */   private String mShortName;
/* 17:   */   @ApiField("sub_m_short_name")
/* 18:   */   private String subMShortName;
/* 19:   */   
/* 20:   */   public List<InvoiceModelContent> getInvoiceInfo()
/* 21:   */   {
/* 22:39 */     return this.invoiceInfo;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setInvoiceInfo(List<InvoiceModelContent> invoiceInfo)
/* 26:   */   {
/* 27:42 */     this.invoiceInfo = invoiceInfo;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getmShortName()
/* 31:   */   {
/* 32:46 */     return this.mShortName;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setmShortName(String mShortName)
/* 36:   */   {
/* 37:49 */     this.mShortName = mShortName;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public String getSubMShortName()
/* 41:   */   {
/* 42:53 */     return this.subMShortName;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setSubMShortName(String subMShortName)
/* 46:   */   {
/* 47:56 */     this.subMShortName = subMShortName;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEbppInvoiceSycnModel
 * JD-Core Version:    0.7.0.1
 */