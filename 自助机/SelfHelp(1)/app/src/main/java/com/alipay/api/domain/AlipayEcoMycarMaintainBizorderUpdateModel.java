/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipayEcoMycarMaintainBizorderUpdateModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 1899256519833565527L;
/*  12:    */   @ApiField("appoint_affirm_time")
/*  13:    */   private String appointAffirmTime;
/*  14:    */   @ApiField("appoint_end_time")
/*  15:    */   private String appointEndTime;
/*  16:    */   @ApiField("appoint_start_time")
/*  17:    */   private String appointStartTime;
/*  18:    */   @ApiField("appoint_status")
/*  19:    */   private Long appointStatus;
/*  20:    */   @ApiField("arrive_time")
/*  21:    */   private String arriveTime;
/*  22:    */   @ApiField("order_no")
/*  23:    */   private String orderNo;
/*  24:    */   @ApiListField("order_server_list")
/*  25:    */   @ApiField("maintain_biz_order")
/*  26:    */   private List<MaintainBizOrder> orderServerList;
/*  27:    */   @ApiField("original_cost")
/*  28:    */   private String originalCost;
/*  29:    */   @ApiField("out_shop_id")
/*  30:    */   private String outShopId;
/*  31:    */   @ApiField("real_cost")
/*  32:    */   private String realCost;
/*  33:    */   @ApiField("scene_type")
/*  34:    */   private String sceneType;
/*  35:    */   
/*  36:    */   public String getAppointAffirmTime()
/*  37:    */   {
/*  38:112 */     return this.appointAffirmTime;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void setAppointAffirmTime(String appointAffirmTime)
/*  42:    */   {
/*  43:115 */     this.appointAffirmTime = appointAffirmTime;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public String getAppointEndTime()
/*  47:    */   {
/*  48:119 */     return this.appointEndTime;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setAppointEndTime(String appointEndTime)
/*  52:    */   {
/*  53:122 */     this.appointEndTime = appointEndTime;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public String getAppointStartTime()
/*  57:    */   {
/*  58:126 */     return this.appointStartTime;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setAppointStartTime(String appointStartTime)
/*  62:    */   {
/*  63:129 */     this.appointStartTime = appointStartTime;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public Long getAppointStatus()
/*  67:    */   {
/*  68:133 */     return this.appointStatus;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setAppointStatus(Long appointStatus)
/*  72:    */   {
/*  73:136 */     this.appointStatus = appointStatus;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getArriveTime()
/*  77:    */   {
/*  78:140 */     return this.arriveTime;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setArriveTime(String arriveTime)
/*  82:    */   {
/*  83:143 */     this.arriveTime = arriveTime;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getOrderNo()
/*  87:    */   {
/*  88:147 */     return this.orderNo;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setOrderNo(String orderNo)
/*  92:    */   {
/*  93:150 */     this.orderNo = orderNo;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public List<MaintainBizOrder> getOrderServerList()
/*  97:    */   {
/*  98:154 */     return this.orderServerList;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void setOrderServerList(List<MaintainBizOrder> orderServerList)
/* 102:    */   {
/* 103:157 */     this.orderServerList = orderServerList;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public String getOriginalCost()
/* 107:    */   {
/* 108:161 */     return this.originalCost;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void setOriginalCost(String originalCost)
/* 112:    */   {
/* 113:164 */     this.originalCost = originalCost;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public String getOutShopId()
/* 117:    */   {
/* 118:168 */     return this.outShopId;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void setOutShopId(String outShopId)
/* 122:    */   {
/* 123:171 */     this.outShopId = outShopId;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public String getRealCost()
/* 127:    */   {
/* 128:175 */     return this.realCost;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void setRealCost(String realCost)
/* 132:    */   {
/* 133:178 */     this.realCost = realCost;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public String getSceneType()
/* 137:    */   {
/* 138:182 */     return this.sceneType;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void setSceneType(String sceneType)
/* 142:    */   {
/* 143:185 */     this.sceneType = sceneType;
/* 144:    */   }
/* 145:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarMaintainBizorderUpdateModel
 * JD-Core Version:    0.7.0.1
 */