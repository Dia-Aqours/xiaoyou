/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;

/*   6:    */
/*   7:    */ public class BizOrderQueryResponse
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 6485565223199735734L;
/*  11:    */   @ApiField("action")
/*  12:    */   private String action;
/*  13:    */   @ApiField("action_mode")
/*  14:    */   private String actionMode;
/*  15:    */   @ApiField("apply_id")
/*  16:    */   private String applyId;
/*  17:    */   @ApiField("biz_context_info")
/*  18:    */   private String bizContextInfo;
/*  19:    */   @ApiField("biz_id")
/*  20:    */   private String bizId;
/*  21:    */   @ApiField("biz_type")
/*  22:    */   private String bizType;
/*  23:    */   @ApiField("create_time")
/*  24:    */   private Date createTime;
/*  25:    */   @ApiField("op_id")
/*  26:    */   private String opId;
/*  27:    */   @ApiField("request_id")
/*  28:    */   private String requestId;
/*  29:    */   @ApiField("result_code")
/*  30:    */   private String resultCode;
/*  31:    */   @ApiField("result_desc")
/*  32:    */   private String resultDesc;
/*  33:    */   @ApiField("status")
/*  34:    */   private String status;
/*  35:    */   @ApiField("sub_status")
/*  36:    */   private String subStatus;
/*  37:    */   @ApiField("update_time")
/*  38:    */   private Date updateTime;
/*  39:    */   
/*  40:    */   public String getAction()
/*  41:    */   {
/*  42:113 */     return this.action;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setAction(String action)
/*  46:    */   {
/*  47:116 */     this.action = action;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getActionMode()
/*  51:    */   {
/*  52:120 */     return this.actionMode;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setActionMode(String actionMode)
/*  56:    */   {
/*  57:123 */     this.actionMode = actionMode;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getApplyId()
/*  61:    */   {
/*  62:127 */     return this.applyId;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setApplyId(String applyId)
/*  66:    */   {
/*  67:130 */     this.applyId = applyId;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getBizContextInfo()
/*  71:    */   {
/*  72:134 */     return this.bizContextInfo;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setBizContextInfo(String bizContextInfo)
/*  76:    */   {
/*  77:137 */     this.bizContextInfo = bizContextInfo;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getBizId()
/*  81:    */   {
/*  82:141 */     return this.bizId;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setBizId(String bizId)
/*  86:    */   {
/*  87:144 */     this.bizId = bizId;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getBizType()
/*  91:    */   {
/*  92:148 */     return this.bizType;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setBizType(String bizType)
/*  96:    */   {
/*  97:151 */     this.bizType = bizType;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public Date getCreateTime()
/* 101:    */   {
/* 102:155 */     return this.createTime;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setCreateTime(Date createTime)
/* 106:    */   {
/* 107:158 */     this.createTime = createTime;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public String getOpId()
/* 111:    */   {
/* 112:162 */     return this.opId;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setOpId(String opId)
/* 116:    */   {
/* 117:165 */     this.opId = opId;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public String getRequestId()
/* 121:    */   {
/* 122:169 */     return this.requestId;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void setRequestId(String requestId)
/* 126:    */   {
/* 127:172 */     this.requestId = requestId;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public String getResultCode()
/* 131:    */   {
/* 132:176 */     return this.resultCode;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void setResultCode(String resultCode)
/* 136:    */   {
/* 137:179 */     this.resultCode = resultCode;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public String getResultDesc()
/* 141:    */   {
/* 142:183 */     return this.resultDesc;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void setResultDesc(String resultDesc)
/* 146:    */   {
/* 147:186 */     this.resultDesc = resultDesc;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public String getStatus()
/* 151:    */   {
/* 152:190 */     return this.status;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public void setStatus(String status)
/* 156:    */   {
/* 157:193 */     this.status = status;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public String getSubStatus()
/* 161:    */   {
/* 162:197 */     return this.subStatus;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public void setSubStatus(String subStatus)
/* 166:    */   {
/* 167:200 */     this.subStatus = subStatus;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public Date getUpdateTime()
/* 171:    */   {
/* 172:204 */     return this.updateTime;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void setUpdateTime(Date updateTime)
/* 176:    */   {
/* 177:207 */     this.updateTime = updateTime;
/* 178:    */   }
/* 179:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.BizOrderQueryResponse

 * JD-Core Version:    0.7.0.1

 */