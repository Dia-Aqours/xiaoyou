/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayEcoMycarPromoTicketSyncModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 8232151379236385757L;
/* 12:   */   @ApiField("active_id")
/* 13:   */   private String activeId;
/* 14:   */   @ApiListField("code_no_list")
/* 15:   */   @ApiField("code_n_o_list")
/* 16:   */   private List<CodeNOList> codeNoList;
/* 17:   */   @ApiField("source_type")
/* 18:   */   private String sourceType;
/* 19:   */   
/* 20:   */   public String getActiveId()
/* 21:   */   {
/* 22:39 */     return this.activeId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setActiveId(String activeId)
/* 26:   */   {
/* 27:42 */     this.activeId = activeId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public List<CodeNOList> getCodeNoList()
/* 31:   */   {
/* 32:46 */     return this.codeNoList;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setCodeNoList(List<CodeNOList> codeNoList)
/* 36:   */   {
/* 37:49 */     this.codeNoList = codeNoList;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public String getSourceType()
/* 41:   */   {
/* 42:53 */     return this.sourceType;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setSourceType(String sourceType)
/* 46:   */   {
/* 47:56 */     this.sourceType = sourceType;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarPromoTicketSyncModel
 * JD-Core Version:    0.7.0.1
 */