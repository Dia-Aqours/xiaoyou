/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class TemplateColumnInfoDTO
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1529195132738563238L;
/* 10:   */   @ApiField("code")
/* 11:   */   private String code;
/* 12:   */   @ApiField("more_info")
/* 13:   */   private MoreInfoDTO moreInfo;
/* 14:   */   @ApiField("operate_type")
/* 15:   */   private String operateType;
/* 16:   */   @ApiField("title")
/* 17:   */   private String title;
/* 18:   */   @ApiField("value")
/* 19:   */   private String value;
/* 20:   */   
/* 21:   */   public String getCode()
/* 22:   */   {
/* 23:54 */     return this.code;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setCode(String code)
/* 27:   */   {
/* 28:57 */     this.code = code;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public MoreInfoDTO getMoreInfo()
/* 32:   */   {
/* 33:61 */     return this.moreInfo;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setMoreInfo(MoreInfoDTO moreInfo)
/* 37:   */   {
/* 38:64 */     this.moreInfo = moreInfo;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getOperateType()
/* 42:   */   {
/* 43:68 */     return this.operateType;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setOperateType(String operateType)
/* 47:   */   {
/* 48:71 */     this.operateType = operateType;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getTitle()
/* 52:   */   {
/* 53:75 */     return this.title;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setTitle(String title)
/* 57:   */   {
/* 58:78 */     this.title = title;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getValue()
/* 62:   */   {
/* 63:82 */     return this.value;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setValue(String value)
/* 67:   */   {
/* 68:85 */     this.value = value;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.TemplateColumnInfoDTO
 * JD-Core Version:    0.7.0.1
 */