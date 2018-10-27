/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class AlipayOfflineMarketApplyorderBatchqueryModel
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 5568949716826344293L;
/*  13:    */   @ApiField("action")
/*  14:    */   private String action;
/*  15:    */   @ApiListField("apply_ids")
/*  16:    */   @ApiField("string")
/*  17:    */   private List<String> applyIds;
/*  18:    */   @ApiField("biz_id")
/*  19:    */   private String bizId;
/*  20:    */   @ApiField("biz_type")
/*  21:    */   private String bizType;
/*  22:    */   @ApiField("end_time")
/*  23:    */   private Date endTime;
/*  24:    */   @ApiField("op_id")
/*  25:    */   private String opId;
/*  26:    */   @ApiField("op_role")
/*  27:    */   private String opRole;
/*  28:    */   @ApiField("page_no")
/*  29:    */   private Long pageNo;
/*  30:    */   @ApiField("page_size")
/*  31:    */   private Long pageSize;
/*  32:    */   @ApiListField("request_ids")
/*  33:    */   @ApiField("string")
/*  34:    */   private List<String> requestIds;
/*  35:    */   @ApiField("start_time")
/*  36:    */   private Date startTime;
/*  37:    */   @ApiField("status")
/*  38:    */   private String status;
/*  39:    */   
/*  40:    */   public String getAction()
/*  41:    */   {
/*  42: 96 */     return this.action;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setAction(String action)
/*  46:    */   {
/*  47: 99 */     this.action = action;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public List<String> getApplyIds()
/*  51:    */   {
/*  52:103 */     return this.applyIds;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setApplyIds(List<String> applyIds)
/*  56:    */   {
/*  57:106 */     this.applyIds = applyIds;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getBizId()
/*  61:    */   {
/*  62:110 */     return this.bizId;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setBizId(String bizId)
/*  66:    */   {
/*  67:113 */     this.bizId = bizId;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getBizType()
/*  71:    */   {
/*  72:117 */     return this.bizType;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setBizType(String bizType)
/*  76:    */   {
/*  77:120 */     this.bizType = bizType;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public Date getEndTime()
/*  81:    */   {
/*  82:124 */     return this.endTime;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setEndTime(Date endTime)
/*  86:    */   {
/*  87:127 */     this.endTime = endTime;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getOpId()
/*  91:    */   {
/*  92:131 */     return this.opId;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setOpId(String opId)
/*  96:    */   {
/*  97:134 */     this.opId = opId;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getOpRole()
/* 101:    */   {
/* 102:138 */     return this.opRole;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setOpRole(String opRole)
/* 106:    */   {
/* 107:141 */     this.opRole = opRole;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public Long getPageNo()
/* 111:    */   {
/* 112:145 */     return this.pageNo;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setPageNo(Long pageNo)
/* 116:    */   {
/* 117:148 */     this.pageNo = pageNo;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public Long getPageSize()
/* 121:    */   {
/* 122:152 */     return this.pageSize;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void setPageSize(Long pageSize)
/* 126:    */   {
/* 127:155 */     this.pageSize = pageSize;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public List<String> getRequestIds()
/* 131:    */   {
/* 132:159 */     return this.requestIds;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void setRequestIds(List<String> requestIds)
/* 136:    */   {
/* 137:162 */     this.requestIds = requestIds;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public Date getStartTime()
/* 141:    */   {
/* 142:166 */     return this.startTime;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void setStartTime(Date startTime)
/* 146:    */   {
/* 147:169 */     this.startTime = startTime;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public String getStatus()
/* 151:    */   {
/* 152:173 */     return this.status;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public void setStatus(String status)
/* 156:    */   {
/* 157:176 */     this.status = status;
/* 158:    */   }
/* 159:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketApplyorderBatchqueryModel
 * JD-Core Version:    0.7.0.1
 */