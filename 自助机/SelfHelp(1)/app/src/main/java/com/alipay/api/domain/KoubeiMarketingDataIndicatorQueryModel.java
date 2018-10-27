/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class KoubeiMarketingDataIndicatorQueryModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 4673728399692326153L;
/*  10:    */   @ApiField("begin_date")
/*  11:    */   private String beginDate;
/*  12:    */   @ApiField("biz_type")
/*  13:    */   private String bizType;
/*  14:    */   @ApiField("end_date")
/*  15:    */   private String endDate;
/*  16:    */   @ApiField("ext_info")
/*  17:    */   private String extInfo;
/*  18:    */   @ApiField("page_num")
/*  19:    */   private String pageNum;
/*  20:    */   @ApiField("page_size")
/*  21:    */   private String pageSize;
/*  22:    */   
/*  23:    */   public String getBeginDate()
/*  24:    */   {
/*  25: 62 */     return this.beginDate;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public void setBeginDate(String beginDate)
/*  29:    */   {
/*  30: 65 */     this.beginDate = beginDate;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public String getBizType()
/*  34:    */   {
/*  35: 69 */     return this.bizType;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void setBizType(String bizType)
/*  39:    */   {
/*  40: 72 */     this.bizType = bizType;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public String getEndDate()
/*  44:    */   {
/*  45: 76 */     return this.endDate;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void setEndDate(String endDate)
/*  49:    */   {
/*  50: 79 */     this.endDate = endDate;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public String getExtInfo()
/*  54:    */   {
/*  55: 83 */     return this.extInfo;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void setExtInfo(String extInfo)
/*  59:    */   {
/*  60: 86 */     this.extInfo = extInfo;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public String getPageNum()
/*  64:    */   {
/*  65: 90 */     return this.pageNum;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void setPageNum(String pageNum)
/*  69:    */   {
/*  70: 93 */     this.pageNum = pageNum;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public String getPageSize()
/*  74:    */   {
/*  75: 97 */     return this.pageSize;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setPageSize(String pageSize)
/*  79:    */   {
/*  80:100 */     this.pageSize = pageSize;
/*  81:    */   }
/*  82:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingDataIndicatorQueryModel
 * JD-Core Version:    0.7.0.1
 */