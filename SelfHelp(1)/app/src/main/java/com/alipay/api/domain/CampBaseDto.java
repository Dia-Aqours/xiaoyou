/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class CampBaseDto
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 4175874128841623842L;
/*  11:    */   @ApiField("audit_status")
/*  12:    */   private String auditStatus;
/*  13:    */   @ApiField("auto_delay_flag")
/*  14:    */   private String autoDelayFlag;
/*  15:    */   @ApiField("end_time")
/*  16:    */   private Date endTime;
/*  17:    */   @ApiField("id")
/*  18:    */   private String id;
/*  19:    */   @ApiField("name")
/*  20:    */   private String name;
/*  21:    */   @ApiField("plan_status")
/*  22:    */   private String planStatus;
/*  23:    */   @ApiField("start_time")
/*  24:    */   private Date startTime;
/*  25:    */   @ApiField("status")
/*  26:    */   private String status;
/*  27:    */   @ApiField("type")
/*  28:    */   private String type;
/*  29:    */   
/*  30:    */   public String getAuditStatus()
/*  31:    */   {
/*  32: 73 */     return this.auditStatus;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setAuditStatus(String auditStatus)
/*  36:    */   {
/*  37: 76 */     this.auditStatus = auditStatus;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getAutoDelayFlag()
/*  41:    */   {
/*  42: 80 */     return this.autoDelayFlag;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setAutoDelayFlag(String autoDelayFlag)
/*  46:    */   {
/*  47: 83 */     this.autoDelayFlag = autoDelayFlag;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public Date getEndTime()
/*  51:    */   {
/*  52: 87 */     return this.endTime;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setEndTime(Date endTime)
/*  56:    */   {
/*  57: 90 */     this.endTime = endTime;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getId()
/*  61:    */   {
/*  62: 94 */     return this.id;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setId(String id)
/*  66:    */   {
/*  67: 97 */     this.id = id;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getName()
/*  71:    */   {
/*  72:101 */     return this.name;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setName(String name)
/*  76:    */   {
/*  77:104 */     this.name = name;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getPlanStatus()
/*  81:    */   {
/*  82:108 */     return this.planStatus;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setPlanStatus(String planStatus)
/*  86:    */   {
/*  87:111 */     this.planStatus = planStatus;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public Date getStartTime()
/*  91:    */   {
/*  92:115 */     return this.startTime;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setStartTime(Date startTime)
/*  96:    */   {
/*  97:118 */     this.startTime = startTime;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getStatus()
/* 101:    */   {
/* 102:122 */     return this.status;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setStatus(String status)
/* 106:    */   {
/* 107:125 */     this.status = status;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public String getType()
/* 111:    */   {
/* 112:129 */     return this.type;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setType(String type)
/* 116:    */   {
/* 117:132 */     this.type = type;
/* 118:    */   }
/* 119:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.CampBaseDto
 * JD-Core Version:    0.7.0.1
 */