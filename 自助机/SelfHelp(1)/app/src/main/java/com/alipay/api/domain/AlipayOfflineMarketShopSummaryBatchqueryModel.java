/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayOfflineMarketShopSummaryBatchqueryModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 1243932719342575738L;
/*  10:    */   @ApiField("op_role")
/*  11:    */   private String opRole;
/*  12:    */   @ApiField("page_no")
/*  13:    */   private Long pageNo;
/*  14:    */   @ApiField("page_size")
/*  15:    */   private Long pageSize;
/*  16:    */   @ApiField("query_type")
/*  17:    */   private String queryType;
/*  18:    */   @ApiField("related_partner_id")
/*  19:    */   private String relatedPartnerId;
/*  20:    */   @ApiField("shop_id")
/*  21:    */   private String shopId;
/*  22:    */   @ApiField("shop_status")
/*  23:    */   private String shopStatus;
/*  24:    */   
/*  25:    */   public String getOpRole()
/*  26:    */   {
/*  27: 64 */     return this.opRole;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setOpRole(String opRole)
/*  31:    */   {
/*  32: 67 */     this.opRole = opRole;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public Long getPageNo()
/*  36:    */   {
/*  37: 71 */     return this.pageNo;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setPageNo(Long pageNo)
/*  41:    */   {
/*  42: 74 */     this.pageNo = pageNo;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public Long getPageSize()
/*  46:    */   {
/*  47: 78 */     return this.pageSize;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setPageSize(Long pageSize)
/*  51:    */   {
/*  52: 81 */     this.pageSize = pageSize;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getQueryType()
/*  56:    */   {
/*  57: 85 */     return this.queryType;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setQueryType(String queryType)
/*  61:    */   {
/*  62: 88 */     this.queryType = queryType;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getRelatedPartnerId()
/*  66:    */   {
/*  67: 92 */     return this.relatedPartnerId;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setRelatedPartnerId(String relatedPartnerId)
/*  71:    */   {
/*  72: 95 */     this.relatedPartnerId = relatedPartnerId;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getShopId()
/*  76:    */   {
/*  77: 99 */     return this.shopId;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setShopId(String shopId)
/*  81:    */   {
/*  82:102 */     this.shopId = shopId;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getShopStatus()
/*  86:    */   {
/*  87:106 */     return this.shopStatus;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setShopStatus(String shopStatus)
/*  91:    */   {
/*  92:109 */     this.shopStatus = shopStatus;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketShopSummaryBatchqueryModel
 * JD-Core Version:    0.7.0.1
 */