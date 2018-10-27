/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class OldListListComplexMockModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 4788772528263422883L;
/* 12:   */   @ApiListField("cm_list")
/* 13:   */   @ApiField("old_complext_mock_model")
/* 14:   */   private List<OldComplextMockModel> cmList;
/* 15:   */   
/* 16:   */   public List<OldComplextMockModel> getCmList()
/* 17:   */   {
/* 18:27 */     return this.cmList;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void setCmList(List<OldComplextMockModel> cmList)
/* 22:   */   {
/* 23:30 */     this.cmList = cmList;
/* 24:   */   }
/* 25:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.OldListListComplexMockModel
 * JD-Core Version:    0.7.0.1
 */