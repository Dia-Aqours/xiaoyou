/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;

/*  7:   */
/*  8:   */ public class ShopEquipmentBindInfo
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 3371335755688477444L;
/* 12:   */   @ApiListField("equipments")
/* 13:   */   @ApiField("equipment_bind_info")
/* 14:   */   private List<EquipmentBindInfo> equipments;
/* 15:   */   @ApiField("shop_id")
/* 16:   */   private String shopId;
/* 17:   */   @ApiField("shop_name")
/* 18:   */   private String shopName;
/* 19:   */   
/* 20:   */   public List<EquipmentBindInfo> getEquipments()
/* 21:   */   {
/* 22:39 */     return this.equipments;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setEquipments(List<EquipmentBindInfo> equipments)
/* 26:   */   {
/* 27:42 */     this.equipments = equipments;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getShopId()
/* 31:   */   {
/* 32:46 */     return this.shopId;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setShopId(String shopId)
/* 36:   */   {
/* 37:49 */     this.shopId = shopId;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public String getShopName()
/* 41:   */   {
/* 42:53 */     return this.shopName;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setShopName(String shopName)
/* 46:   */   {
/* 47:56 */     this.shopName = shopName;
/* 48:   */   }
/* 49:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.ShopEquipmentBindInfo

 * JD-Core Version:    0.7.0.1

 */