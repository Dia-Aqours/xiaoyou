/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;

/*  7:   */
/*  8:   */ public class ListListSmMockModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 8166929669959342366L;
/* 12:   */   @ApiListField("list_simple_model_list")
/* 13:   */   @ApiField("simple_mock_model")
/* 14:   */   private List<SimpleMockModel> listSimpleModelList;
/* 15:   */   
/* 16:   */   public List<SimpleMockModel> getListSimpleModelList()
/* 17:   */   {
/* 18:27 */     return this.listSimpleModelList;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void setListSimpleModelList(List<SimpleMockModel> listSimpleModelList)
/* 22:   */   {
/* 23:30 */     this.listSimpleModelList = listSimpleModelList;
/* 24:   */   }
/* 25:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.ListListSmMockModel

 * JD-Core Version:    0.7.0.1

 */