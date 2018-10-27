/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.ListListSmMockModel;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayMobilePublicMockListsmlistApiResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 2772935819553936549L;
/* 13:   */   @ApiListField("list_sm_model_list")
/* 14:   */   @ApiField("list_list_sm_mock_model")
/* 15:   */   private List<ListListSmMockModel> listSmModelList;
/* 16:   */   
/* 17:   */   public void setListSmModelList(List<ListListSmMockModel> listSmModelList)
/* 18:   */   {
/* 19:28 */     this.listSmModelList = listSmModelList;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<ListListSmMockModel> getListSmModelList()
/* 23:   */   {
/* 24:31 */     return this.listSmModelList;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMobilePublicMockListsmlistApiResponse
 * JD-Core Version:    0.7.0.1
 */