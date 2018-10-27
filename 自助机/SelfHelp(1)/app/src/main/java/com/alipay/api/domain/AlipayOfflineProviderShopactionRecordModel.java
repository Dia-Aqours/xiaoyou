/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayOfflineProviderShopactionRecordModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 7844536774885454392L;
/*  10:    */   @ApiField("action_detail")
/*  11:    */   private String actionDetail;
/*  12:    */   @ApiField("action_outer_id")
/*  13:    */   private String actionOuterId;
/*  14:    */   @ApiField("action_type")
/*  15:    */   private String actionType;
/*  16:    */   @ApiField("date_time")
/*  17:    */   private String dateTime;
/*  18:    */   @ApiField("entity")
/*  19:    */   private String entity;
/*  20:    */   @ApiField("industry")
/*  21:    */   private String industry;
/*  22:    */   @ApiField("outer_shop_do")
/*  23:    */   private OuterShopDO outerShopDo;
/*  24:    */   
/*  25:    */   public String getActionDetail()
/*  26:    */   {
/*  27: 59 */     return this.actionDetail;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setActionDetail(String actionDetail)
/*  31:    */   {
/*  32: 62 */     this.actionDetail = actionDetail;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getActionOuterId()
/*  36:    */   {
/*  37: 66 */     return this.actionOuterId;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setActionOuterId(String actionOuterId)
/*  41:    */   {
/*  42: 69 */     this.actionOuterId = actionOuterId;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getActionType()
/*  46:    */   {
/*  47: 73 */     return this.actionType;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setActionType(String actionType)
/*  51:    */   {
/*  52: 76 */     this.actionType = actionType;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getDateTime()
/*  56:    */   {
/*  57: 80 */     return this.dateTime;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setDateTime(String dateTime)
/*  61:    */   {
/*  62: 83 */     this.dateTime = dateTime;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getEntity()
/*  66:    */   {
/*  67: 87 */     return this.entity;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setEntity(String entity)
/*  71:    */   {
/*  72: 90 */     this.entity = entity;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getIndustry()
/*  76:    */   {
/*  77: 94 */     return this.industry;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setIndustry(String industry)
/*  81:    */   {
/*  82: 97 */     this.industry = industry;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public OuterShopDO getOuterShopDo()
/*  86:    */   {
/*  87:101 */     return this.outerShopDo;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setOuterShopDo(OuterShopDO outerShopDo)
/*  91:    */   {
/*  92:104 */     this.outerShopDo = outerShopDo;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineProviderShopactionRecordModel
 * JD-Core Version:    0.7.0.1
 */