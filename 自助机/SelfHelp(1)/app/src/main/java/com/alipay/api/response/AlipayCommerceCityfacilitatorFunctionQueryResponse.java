/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.SupportFunction;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayCommerceCityfacilitatorFunctionQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 1898741773713819836L;
/* 13:   */   @ApiListField("functions")
/* 14:   */   @ApiField("support_function")
/* 15:   */   private List<SupportFunction> functions;
/* 16:   */   
/* 17:   */   public void setFunctions(List<SupportFunction> functions)
/* 18:   */   {
/* 19:28 */     this.functions = functions;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<SupportFunction> getFunctions()
/* 23:   */   {
/* 24:31 */     return this.functions;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayCommerceCityfacilitatorFunctionQueryResponse
 * JD-Core Version:    0.7.0.1
 */