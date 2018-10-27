/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipaySecurityProdFacerepoAddResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2471874843981999271L;
/* 10:   */   @ApiField("ext_info")
/* 11:   */   private String extInfo;
/* 12:   */   @ApiField("face_id")
/* 13:   */   private String faceId;
/* 14:   */   
/* 15:   */   public void setExtInfo(String extInfo)
/* 16:   */   {
/* 17:30 */     this.extInfo = extInfo;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getExtInfo()
/* 21:   */   {
/* 22:33 */     return this.extInfo;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setFaceId(String faceId)
/* 26:   */   {
/* 27:37 */     this.faceId = faceId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getFaceId()
/* 31:   */   {
/* 32:40 */     return this.faceId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipaySecurityProdFacerepoAddResponse
 * JD-Core Version:    0.7.0.1
 */