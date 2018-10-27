/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayOfflineProviderEquipmentAuthQuerybypageModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 1882536649891521394L;
/*  10:    */   @ApiField("begin_time")
/*  11:    */   private String beginTime;
/*  12:    */   @ApiField("device_type")
/*  13:    */   private String deviceType;
/*  14:    */   @ApiField("end_time")
/*  15:    */   private String endTime;
/*  16:    */   @ApiField("ext_info")
/*  17:    */   private String extInfo;
/*  18:    */   @ApiField("merchant_pid")
/*  19:    */   private String merchantPid;
/*  20:    */   @ApiField("page_num")
/*  21:    */   private String pageNum;
/*  22:    */   @ApiField("page_size")
/*  23:    */   private String pageSize;
/*  24:    */   
/*  25:    */   public String getBeginTime()
/*  26:    */   {
/*  27: 59 */     return this.beginTime;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setBeginTime(String beginTime)
/*  31:    */   {
/*  32: 62 */     this.beginTime = beginTime;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getDeviceType()
/*  36:    */   {
/*  37: 66 */     return this.deviceType;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setDeviceType(String deviceType)
/*  41:    */   {
/*  42: 69 */     this.deviceType = deviceType;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getEndTime()
/*  46:    */   {
/*  47: 73 */     return this.endTime;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setEndTime(String endTime)
/*  51:    */   {
/*  52: 76 */     this.endTime = endTime;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getExtInfo()
/*  56:    */   {
/*  57: 80 */     return this.extInfo;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setExtInfo(String extInfo)
/*  61:    */   {
/*  62: 83 */     this.extInfo = extInfo;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getMerchantPid()
/*  66:    */   {
/*  67: 87 */     return this.merchantPid;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setMerchantPid(String merchantPid)
/*  71:    */   {
/*  72: 90 */     this.merchantPid = merchantPid;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getPageNum()
/*  76:    */   {
/*  77: 94 */     return this.pageNum;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setPageNum(String pageNum)
/*  81:    */   {
/*  82: 97 */     this.pageNum = pageNum;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getPageSize()
/*  86:    */   {
/*  87:101 */     return this.pageSize;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setPageSize(String pageSize)
/*  91:    */   {
/*  92:104 */     this.pageSize = pageSize;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineProviderEquipmentAuthQuerybypageModel
 * JD-Core Version:    0.7.0.1
 */