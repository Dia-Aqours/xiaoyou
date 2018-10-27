/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayOpenPublicFollowBatchqueryResponse
/*  9:   */   extends AlipayResponse
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 4849651269717127635L;
/* 12:   */   @ApiField("count")
/* 13:   */   private String count;
/* 14:   */   @ApiField("next_user_id")
/* 15:   */   private String nextUserId;
/* 16:   */   @ApiListField("user_id_list")
/* 17:   */   @ApiField("string")
/* 18:   */   private List<String> userIdList;
/* 19:   */   
/* 20:   */   public void setCount(String count)
/* 21:   */   {
/* 22:39 */     this.count = count;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getCount()
/* 26:   */   {
/* 27:42 */     return this.count;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setNextUserId(String nextUserId)
/* 31:   */   {
/* 32:46 */     this.nextUserId = nextUserId;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public String getNextUserId()
/* 36:   */   {
/* 37:49 */     return this.nextUserId;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void setUserIdList(List<String> userIdList)
/* 41:   */   {
/* 42:53 */     this.userIdList = userIdList;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public List<String> getUserIdList()
/* 46:   */   {
/* 47:56 */     return this.userIdList;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOpenPublicFollowBatchqueryResponse
 * JD-Core Version:    0.7.0.1
 */