/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class ExRefRateInfoVO
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 4168981123412897947L;
/*  11:    */   @ApiField("currency_pair")
/*  12:    */   private String currencyPair;
/*  13:    */   @ApiField("datum_currency")
/*  14:    */   private String datumCurrency;
/*  15:    */   @ApiField("price_type")
/*  16:    */   private String priceType;
/*  17:    */   @ApiField("pub_date")
/*  18:    */   private String pubDate;
/*  19:    */   @ApiField("pub_time")
/*  20:    */   private Date pubTime;
/*  21:    */   @ApiField("rate")
/*  22:    */   private String rate;
/*  23:    */   @ApiField("target_currency")
/*  24:    */   private String targetCurrency;
/*  25:    */   
/*  26:    */   public String getCurrencyPair()
/*  27:    */   {
/*  28: 61 */     return this.currencyPair;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void setCurrencyPair(String currencyPair)
/*  32:    */   {
/*  33: 64 */     this.currencyPair = currencyPair;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public String getDatumCurrency()
/*  37:    */   {
/*  38: 68 */     return this.datumCurrency;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void setDatumCurrency(String datumCurrency)
/*  42:    */   {
/*  43: 71 */     this.datumCurrency = datumCurrency;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public String getPriceType()
/*  47:    */   {
/*  48: 75 */     return this.priceType;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setPriceType(String priceType)
/*  52:    */   {
/*  53: 78 */     this.priceType = priceType;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public String getPubDate()
/*  57:    */   {
/*  58: 82 */     return this.pubDate;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setPubDate(String pubDate)
/*  62:    */   {
/*  63: 85 */     this.pubDate = pubDate;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public Date getPubTime()
/*  67:    */   {
/*  68: 89 */     return this.pubTime;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setPubTime(Date pubTime)
/*  72:    */   {
/*  73: 92 */     this.pubTime = pubTime;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getRate()
/*  77:    */   {
/*  78: 96 */     return this.rate;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setRate(String rate)
/*  82:    */   {
/*  83: 99 */     this.rate = rate;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getTargetCurrency()
/*  87:    */   {
/*  88:103 */     return this.targetCurrency;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setTargetCurrency(String targetCurrency)
/*  92:    */   {
/*  93:106 */     this.targetCurrency = targetCurrency;
/*  94:    */   }
/*  95:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ExRefRateInfoVO
 * JD-Core Version:    0.7.0.1
 */