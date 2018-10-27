/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.StationDetailInfo;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayCommerceCityfacilitatorStationQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 5617746962155249975L;
/* 13:   */   @ApiListField("support_starts")
/* 14:   */   @ApiField("station_detail_info")
/* 15:   */   private List<StationDetailInfo> supportStarts;
/* 16:   */   
/* 17:   */   public void setSupportStarts(List<StationDetailInfo> supportStarts)
/* 18:   */   {
/* 19:28 */     this.supportStarts = supportStarts;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<StationDetailInfo> getSupportStarts()
/* 23:   */   {
/* 24:31 */     return this.supportStarts;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayCommerceCityfacilitatorStationQueryResponse
 * JD-Core Version:    0.7.0.1
 */