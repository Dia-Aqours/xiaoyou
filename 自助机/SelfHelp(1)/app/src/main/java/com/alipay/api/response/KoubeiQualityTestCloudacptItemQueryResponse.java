/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.domain.OpenItem;
/*   5:    */ import com.alipay.api.internal.mapping.ApiField;
/*   6:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class KoubeiQualityTestCloudacptItemQueryResponse
/*  10:    */   extends AlipayResponse
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 3135293513517181751L;
/*  13:    */   @ApiField("activity_id")
/*  14:    */   private String activityId;
/*  15:    */   @ApiField("batch_id")
/*  16:    */   private String batchId;
/*  17:    */   @ApiField("batch_status")
/*  18:    */   private String batchStatus;
/*  19:    */   @ApiListField("fail_list")
/*  20:    */   @ApiField("open_item")
/*  21:    */   private List<OpenItem> failList;
/*  22:    */   @ApiField("fail_num")
/*  23:    */   private String failNum;
/*  24:    */   @ApiListField("item_list")
/*  25:    */   @ApiField("open_item")
/*  26:    */   private List<OpenItem> itemList;
/*  27:    */   @ApiField("item_num")
/*  28:    */   private String itemNum;
/*  29:    */   @ApiListField("pass_list")
/*  30:    */   @ApiField("open_item")
/*  31:    */   private List<OpenItem> passList;
/*  32:    */   @ApiField("pass_num")
/*  33:    */   private String passNum;
/*  34:    */   
/*  35:    */   public void setActivityId(String activityId)
/*  36:    */   {
/*  37: 82 */     this.activityId = activityId;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getActivityId()
/*  41:    */   {
/*  42: 85 */     return this.activityId;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setBatchId(String batchId)
/*  46:    */   {
/*  47: 89 */     this.batchId = batchId;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getBatchId()
/*  51:    */   {
/*  52: 92 */     return this.batchId;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setBatchStatus(String batchStatus)
/*  56:    */   {
/*  57: 96 */     this.batchStatus = batchStatus;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getBatchStatus()
/*  61:    */   {
/*  62: 99 */     return this.batchStatus;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setFailList(List<OpenItem> failList)
/*  66:    */   {
/*  67:103 */     this.failList = failList;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public List<OpenItem> getFailList()
/*  71:    */   {
/*  72:106 */     return this.failList;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setFailNum(String failNum)
/*  76:    */   {
/*  77:110 */     this.failNum = failNum;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getFailNum()
/*  81:    */   {
/*  82:113 */     return this.failNum;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setItemList(List<OpenItem> itemList)
/*  86:    */   {
/*  87:117 */     this.itemList = itemList;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public List<OpenItem> getItemList()
/*  91:    */   {
/*  92:120 */     return this.itemList;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setItemNum(String itemNum)
/*  96:    */   {
/*  97:124 */     this.itemNum = itemNum;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getItemNum()
/* 101:    */   {
/* 102:127 */     return this.itemNum;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setPassList(List<OpenItem> passList)
/* 106:    */   {
/* 107:131 */     this.passList = passList;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public List<OpenItem> getPassList()
/* 111:    */   {
/* 112:134 */     return this.passList;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setPassNum(String passNum)
/* 116:    */   {
/* 117:138 */     this.passNum = passNum;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public String getPassNum()
/* 121:    */   {
/* 122:141 */     return this.passNum;
/* 123:    */   }
/* 124:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiQualityTestCloudacptItemQueryResponse
 * JD-Core Version:    0.7.0.1
 */