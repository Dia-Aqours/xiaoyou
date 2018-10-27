/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipaySocialBaseGroupCreateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2199821357195891964L;
/* 10:   */   @ApiField("biz_no")
/* 11:   */   private String bizNo;
/* 12:   */   @ApiField("biz_type")
/* 13:   */   private String bizType;
/* 14:   */   @ApiField("group_settings")
/* 15:   */   private GroupSetting groupSettings;
/* 16:   */   @ApiField("master_id")
/* 17:   */   private String masterId;
/* 18:   */   
/* 19:   */   public String getBizNo()
/* 20:   */   {
/* 21:41 */     return this.bizNo;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setBizNo(String bizNo)
/* 25:   */   {
/* 26:44 */     this.bizNo = bizNo;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getBizType()
/* 30:   */   {
/* 31:48 */     return this.bizType;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setBizType(String bizType)
/* 35:   */   {
/* 36:51 */     this.bizType = bizType;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public GroupSetting getGroupSettings()
/* 40:   */   {
/* 41:55 */     return this.groupSettings;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setGroupSettings(GroupSetting groupSettings)
/* 45:   */   {
/* 46:58 */     this.groupSettings = groupSettings;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getMasterId()
/* 50:   */   {
/* 51:62 */     return this.masterId;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setMasterId(String masterId)
/* 55:   */   {
/* 56:65 */     this.masterId = masterId;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipaySocialBaseGroupCreateModel
 * JD-Core Version:    0.7.0.1
 */