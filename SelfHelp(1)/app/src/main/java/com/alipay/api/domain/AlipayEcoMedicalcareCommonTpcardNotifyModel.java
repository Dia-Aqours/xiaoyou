/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipayEcoMedicalcareCommonTpcardNotifyModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 3615445623916913685L;
/*  12:    */   @ApiListField("action_info")
/*  13:    */   @ApiField("medical_sv_tp_card_action_info")
/*  14:    */   private List<MedicalSvTpCardActionInfo> actionInfo;
/*  15:    */   @ApiListField("body_info")
/*  16:    */   @ApiField("medical_sv_tp_card_body_info")
/*  17:    */   private List<MedicalSvTpCardBodyInfo> bodyInfo;
/*  18:    */   @ApiField("extend_params")
/*  19:    */   private String extendParams;
/*  20:    */   @ApiField("header_info")
/*  21:    */   private MedicalSvTpCardHeadInfo headerInfo;
/*  22:    */   @ApiField("notify_time")
/*  23:    */   private String notifyTime;
/*  24:    */   @ApiField("operate")
/*  25:    */   private String operate;
/*  26:    */   @ApiField("template_code")
/*  27:    */   private String templateCode;
/*  28:    */   @ApiField("third_no")
/*  29:    */   private String thirdNo;
/*  30:    */   @ApiField("user_id")
/*  31:    */   private String userId;
/*  32:    */   
/*  33:    */   public List<MedicalSvTpCardActionInfo> getActionInfo()
/*  34:    */   {
/*  35: 86 */     return this.actionInfo;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void setActionInfo(List<MedicalSvTpCardActionInfo> actionInfo)
/*  39:    */   {
/*  40: 89 */     this.actionInfo = actionInfo;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public List<MedicalSvTpCardBodyInfo> getBodyInfo()
/*  44:    */   {
/*  45: 93 */     return this.bodyInfo;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void setBodyInfo(List<MedicalSvTpCardBodyInfo> bodyInfo)
/*  49:    */   {
/*  50: 96 */     this.bodyInfo = bodyInfo;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public String getExtendParams()
/*  54:    */   {
/*  55:100 */     return this.extendParams;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void setExtendParams(String extendParams)
/*  59:    */   {
/*  60:103 */     this.extendParams = extendParams;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public MedicalSvTpCardHeadInfo getHeaderInfo()
/*  64:    */   {
/*  65:107 */     return this.headerInfo;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void setHeaderInfo(MedicalSvTpCardHeadInfo headerInfo)
/*  69:    */   {
/*  70:110 */     this.headerInfo = headerInfo;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public String getNotifyTime()
/*  74:    */   {
/*  75:114 */     return this.notifyTime;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setNotifyTime(String notifyTime)
/*  79:    */   {
/*  80:117 */     this.notifyTime = notifyTime;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public String getOperate()
/*  84:    */   {
/*  85:121 */     return this.operate;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setOperate(String operate)
/*  89:    */   {
/*  90:124 */     this.operate = operate;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public String getTemplateCode()
/*  94:    */   {
/*  95:128 */     return this.templateCode;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void setTemplateCode(String templateCode)
/*  99:    */   {
/* 100:131 */     this.templateCode = templateCode;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public String getThirdNo()
/* 104:    */   {
/* 105:135 */     return this.thirdNo;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public void setThirdNo(String thirdNo)
/* 109:    */   {
/* 110:138 */     this.thirdNo = thirdNo;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public String getUserId()
/* 114:    */   {
/* 115:142 */     return this.userId;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void setUserId(String userId)
/* 119:    */   {
/* 120:145 */     this.userId = userId;
/* 121:    */   }
/* 122:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMedicalcareCommonTpcardNotifyModel
 * JD-Core Version:    0.7.0.1
 */