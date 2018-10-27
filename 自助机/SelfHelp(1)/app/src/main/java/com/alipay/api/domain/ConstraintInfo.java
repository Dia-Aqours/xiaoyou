/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class ConstraintInfo
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 3561697678979439422L;
/*  12:    */   @ApiField("crowd_group_id")
/*  13:    */   private String crowdGroupId;
/*  14:    */   @ApiField("crowd_restriction")
/*  15:    */   private String crowdRestriction;
/*  16:    */   @ApiListField("item_ids")
/*  17:    */   @ApiField("string")
/*  18:    */   private List<String> itemIds;
/*  19:    */   @ApiField("min_cost")
/*  20:    */   private String minCost;
/*  21:    */   @ApiListField("suit_shops")
/*  22:    */   @ApiField("string")
/*  23:    */   private List<String> suitShops;
/*  24:    */   @ApiField("user_win_count")
/*  25:    */   private String userWinCount;
/*  26:    */   @ApiField("user_win_frequency")
/*  27:    */   private String userWinFrequency;
/*  28:    */   
/*  29:    */   public String getCrowdGroupId()
/*  30:    */   {
/*  31: 74 */     return this.crowdGroupId;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setCrowdGroupId(String crowdGroupId)
/*  35:    */   {
/*  36: 77 */     this.crowdGroupId = crowdGroupId;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getCrowdRestriction()
/*  40:    */   {
/*  41: 81 */     return this.crowdRestriction;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setCrowdRestriction(String crowdRestriction)
/*  45:    */   {
/*  46: 84 */     this.crowdRestriction = crowdRestriction;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public List<String> getItemIds()
/*  50:    */   {
/*  51: 88 */     return this.itemIds;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setItemIds(List<String> itemIds)
/*  55:    */   {
/*  56: 91 */     this.itemIds = itemIds;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getMinCost()
/*  60:    */   {
/*  61: 95 */     return this.minCost;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setMinCost(String minCost)
/*  65:    */   {
/*  66: 98 */     this.minCost = minCost;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public List<String> getSuitShops()
/*  70:    */   {
/*  71:102 */     return this.suitShops;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setSuitShops(List<String> suitShops)
/*  75:    */   {
/*  76:105 */     this.suitShops = suitShops;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getUserWinCount()
/*  80:    */   {
/*  81:109 */     return this.userWinCount;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setUserWinCount(String userWinCount)
/*  85:    */   {
/*  86:112 */     this.userWinCount = userWinCount;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getUserWinFrequency()
/*  90:    */   {
/*  91:116 */     return this.userWinFrequency;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setUserWinFrequency(String userWinFrequency)
/*  95:    */   {
/*  96:119 */     this.userWinFrequency = userWinFrequency;
/*  97:    */   }
/*  98:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ConstraintInfo
 * JD-Core Version:    0.7.0.1
 */