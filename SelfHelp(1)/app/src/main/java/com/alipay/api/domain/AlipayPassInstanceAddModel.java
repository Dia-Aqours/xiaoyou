/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayPassInstanceAddModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7125478114156324787L;
/* 10:   */   @ApiField("recognition_info")
/* 11:   */   private String recognitionInfo;
/* 12:   */   @ApiField("recognition_type")
/* 13:   */   private String recognitionType;
/* 14:   */   @ApiField("tpl_id")
/* 15:   */   private String tplId;
/* 16:   */   @ApiField("tpl_params")
/* 17:   */   private String tplParams;
/* 18:   */   
/* 19:   */   public String getRecognitionInfo()
/* 20:   */   {
/* 21:42 */     return this.recognitionInfo;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setRecognitionInfo(String recognitionInfo)
/* 25:   */   {
/* 26:45 */     this.recognitionInfo = recognitionInfo;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getRecognitionType()
/* 30:   */   {
/* 31:49 */     return this.recognitionType;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setRecognitionType(String recognitionType)
/* 35:   */   {
/* 36:52 */     this.recognitionType = recognitionType;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getTplId()
/* 40:   */   {
/* 41:56 */     return this.tplId;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setTplId(String tplId)
/* 45:   */   {
/* 46:59 */     this.tplId = tplId;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getTplParams()
/* 50:   */   {
/* 51:63 */     return this.tplParams;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setTplParams(String tplParams)
/* 55:   */   {
/* 56:66 */     this.tplParams = tplParams;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayPassInstanceAddModel
 * JD-Core Version:    0.7.0.1
 */