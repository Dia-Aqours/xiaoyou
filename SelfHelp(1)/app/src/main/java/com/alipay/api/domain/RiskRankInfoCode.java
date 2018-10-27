/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class RiskRankInfoCode
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1873293636123415568L;
/* 10:   */   @ApiField("code")
/* 11:   */   private String code;
/* 12:   */   @ApiField("contribution_degree")
/* 13:   */   private Long contributionDegree;
/* 14:   */   @ApiField("desc")
/* 15:   */   private String desc;
/* 16:   */   @ApiField("model_name")
/* 17:   */   private String modelName;
/* 18:   */   
/* 19:   */   public String getCode()
/* 20:   */   {
/* 21:41 */     return this.code;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setCode(String code)
/* 25:   */   {
/* 26:44 */     this.code = code;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public Long getContributionDegree()
/* 30:   */   {
/* 31:48 */     return this.contributionDegree;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setContributionDegree(Long contributionDegree)
/* 35:   */   {
/* 36:51 */     this.contributionDegree = contributionDegree;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getDesc()
/* 40:   */   {
/* 41:55 */     return this.desc;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setDesc(String desc)
/* 45:   */   {
/* 46:58 */     this.desc = desc;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getModelName()
/* 50:   */   {
/* 51:62 */     return this.modelName;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setModelName(String modelName)
/* 55:   */   {
/* 56:65 */     this.modelName = modelName;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.RiskRankInfoCode
 * JD-Core Version:    0.7.0.1
 */