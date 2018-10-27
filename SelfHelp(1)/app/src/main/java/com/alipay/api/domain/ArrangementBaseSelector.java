/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class ArrangementBaseSelector
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 1819157372337665676L;
/* 12:   */   @ApiListField("ar_statuses")
/* 13:   */   @ApiField("string")
/* 14:   */   private List<String> arStatuses;
/* 15:   */   @ApiField("mark_type")
/* 16:   */   private String markType;
/* 17:   */   @ApiListField("pd_codes")
/* 18:   */   @ApiField("string")
/* 19:   */   private List<String> pdCodes;
/* 20:   */   @ApiListField("pd_marks")
/* 21:   */   @ApiField("string")
/* 22:   */   private List<String> pdMarks;
/* 23:   */   @ApiField("select_pd_mark")
/* 24:   */   private Boolean selectPdMark;
/* 25:   */   @ApiField("select_pd_name")
/* 26:   */   private Boolean selectPdName;
/* 27:   */   
/* 28:   */   public List<String> getArStatuses()
/* 29:   */   {
/* 30:59 */     return this.arStatuses;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setArStatuses(List<String> arStatuses)
/* 34:   */   {
/* 35:62 */     this.arStatuses = arStatuses;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public String getMarkType()
/* 39:   */   {
/* 40:66 */     return this.markType;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void setMarkType(String markType)
/* 44:   */   {
/* 45:69 */     this.markType = markType;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public List<String> getPdCodes()
/* 49:   */   {
/* 50:73 */     return this.pdCodes;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public void setPdCodes(List<String> pdCodes)
/* 54:   */   {
/* 55:76 */     this.pdCodes = pdCodes;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public List<String> getPdMarks()
/* 59:   */   {
/* 60:80 */     return this.pdMarks;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public void setPdMarks(List<String> pdMarks)
/* 64:   */   {
/* 65:83 */     this.pdMarks = pdMarks;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public Boolean getSelectPdMark()
/* 69:   */   {
/* 70:87 */     return this.selectPdMark;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public void setSelectPdMark(Boolean selectPdMark)
/* 74:   */   {
/* 75:90 */     this.selectPdMark = selectPdMark;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public Boolean getSelectPdName()
/* 79:   */   {
/* 80:94 */     return this.selectPdName;
/* 81:   */   }
/* 82:   */   
/* 83:   */   public void setSelectPdName(Boolean selectPdName)
/* 84:   */   {
/* 85:97 */     this.selectPdName = selectPdName;
/* 86:   */   }
/* 87:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ArrangementBaseSelector
 * JD-Core Version:    0.7.0.1
 */