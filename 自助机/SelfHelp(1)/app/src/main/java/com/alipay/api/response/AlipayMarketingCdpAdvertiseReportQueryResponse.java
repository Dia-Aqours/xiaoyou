/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayMarketingCdpAdvertiseReportQueryResponse
/*   7:    */   extends AlipayResponse
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 8496398111553697876L;
/*  10:    */   @ApiField("click_pv_dd")
/*  11:    */   private String clickPvDd;
/*  12:    */   @ApiField("click_pv_history")
/*  13:    */   private String clickPvHistory;
/*  14:    */   @ApiField("click_uv_dd")
/*  15:    */   private String clickUvDd;
/*  16:    */   @ApiField("click_uv_history")
/*  17:    */   private String clickUvHistory;
/*  18:    */   @ApiField("report_date")
/*  19:    */   private String reportDate;
/*  20:    */   @ApiField("show_pv_dd")
/*  21:    */   private String showPvDd;
/*  22:    */   @ApiField("show_pv_history")
/*  23:    */   private String showPvHistory;
/*  24:    */   @ApiField("show_uv_dd")
/*  25:    */   private String showUvDd;
/*  26:    */   @ApiField("show_uv_history")
/*  27:    */   private String showUvHistory;
/*  28:    */   
/*  29:    */   public void setClickPvDd(String clickPvDd)
/*  30:    */   {
/*  31: 72 */     this.clickPvDd = clickPvDd;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public String getClickPvDd()
/*  35:    */   {
/*  36: 75 */     return this.clickPvDd;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void setClickPvHistory(String clickPvHistory)
/*  40:    */   {
/*  41: 79 */     this.clickPvHistory = clickPvHistory;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public String getClickPvHistory()
/*  45:    */   {
/*  46: 82 */     return this.clickPvHistory;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setClickUvDd(String clickUvDd)
/*  50:    */   {
/*  51: 86 */     this.clickUvDd = clickUvDd;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public String getClickUvDd()
/*  55:    */   {
/*  56: 89 */     return this.clickUvDd;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setClickUvHistory(String clickUvHistory)
/*  60:    */   {
/*  61: 93 */     this.clickUvHistory = clickUvHistory;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String getClickUvHistory()
/*  65:    */   {
/*  66: 96 */     return this.clickUvHistory;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setReportDate(String reportDate)
/*  70:    */   {
/*  71:100 */     this.reportDate = reportDate;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getReportDate()
/*  75:    */   {
/*  76:103 */     return this.reportDate;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setShowPvDd(String showPvDd)
/*  80:    */   {
/*  81:107 */     this.showPvDd = showPvDd;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getShowPvDd()
/*  85:    */   {
/*  86:110 */     return this.showPvDd;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setShowPvHistory(String showPvHistory)
/*  90:    */   {
/*  91:114 */     this.showPvHistory = showPvHistory;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getShowPvHistory()
/*  95:    */   {
/*  96:117 */     return this.showPvHistory;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setShowUvDd(String showUvDd)
/* 100:    */   {
/* 101:121 */     this.showUvDd = showUvDd;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getShowUvDd()
/* 105:    */   {
/* 106:124 */     return this.showUvDd;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setShowUvHistory(String showUvHistory)
/* 110:    */   {
/* 111:128 */     this.showUvHistory = showUvHistory;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String getShowUvHistory()
/* 115:    */   {
/* 116:131 */     return this.showUvHistory;
/* 117:    */   }
/* 118:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMarketingCdpAdvertiseReportQueryResponse
 * JD-Core Version:    0.7.0.1
 */