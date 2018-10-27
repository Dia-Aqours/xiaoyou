/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.RecruitItemApplyData;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.Date;
/*  8:   */ import java.util.List;
/*  9:   */ 
/* 10:   */ public class KoubeiMarketingCampaignRecruitApplyQueryResponse
/* 11:   */   extends AlipayResponse
/* 12:   */ {
/* 13:   */   private static final long serialVersionUID = 4718441251961483843L;
/* 14:   */   @ApiField("bought_time")
/* 15:   */   private Date boughtTime;
/* 16:   */   @ApiField("end_time")
/* 17:   */   private Date endTime;
/* 18:   */   @ApiField("item_count")
/* 19:   */   private String itemCount;
/* 20:   */   @ApiListField("item_info")
/* 21:   */   @ApiField("recruit_item_apply_data")
/* 22:   */   private List<RecruitItemApplyData> itemInfo;
/* 23:   */   @ApiField("name")
/* 24:   */   private String name;
/* 25:   */   @ApiField("prehot_time")
/* 26:   */   private Date prehotTime;
/* 27:   */   
/* 28:   */   public void setBoughtTime(Date boughtTime)
/* 29:   */   {
/* 30:59 */     this.boughtTime = boughtTime;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public Date getBoughtTime()
/* 34:   */   {
/* 35:62 */     return this.boughtTime;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setEndTime(Date endTime)
/* 39:   */   {
/* 40:66 */     this.endTime = endTime;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public Date getEndTime()
/* 44:   */   {
/* 45:69 */     return this.endTime;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setItemCount(String itemCount)
/* 49:   */   {
/* 50:73 */     this.itemCount = itemCount;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getItemCount()
/* 54:   */   {
/* 55:76 */     return this.itemCount;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setItemInfo(List<RecruitItemApplyData> itemInfo)
/* 59:   */   {
/* 60:80 */     this.itemInfo = itemInfo;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public List<RecruitItemApplyData> getItemInfo()
/* 64:   */   {
/* 65:83 */     return this.itemInfo;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setName(String name)
/* 69:   */   {
/* 70:87 */     this.name = name;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getName()
/* 74:   */   {
/* 75:90 */     return this.name;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setPrehotTime(Date prehotTime)
/* 79:   */   {
/* 80:94 */     this.prehotTime = prehotTime;
/* 81:   */   }
/* 82:   */   
/* 83:   */   public Date getPrehotTime()
/* 84:   */   {
/* 85:97 */     return this.prehotTime;
/* 86:   */   }
/* 87:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingCampaignRecruitApplyQueryResponse
 * JD-Core Version:    0.7.0.1
 */