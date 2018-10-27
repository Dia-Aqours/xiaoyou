/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.ShopEquipmentBindInfo;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayOfflineSaleleadsMerchantEquipmentQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 5383758677722317436L;
/* 13:   */   @ApiField("merchant_name")
/* 14:   */   private String merchantName;
/* 15:   */   @ApiField("merchant_pid")
/* 16:   */   private String merchantPid;
/* 17:   */   @ApiListField("shopinfos")
/* 18:   */   @ApiField("shop_equipment_bind_info")
/* 19:   */   private List<ShopEquipmentBindInfo> shopinfos;
/* 20:   */   
/* 21:   */   public void setMerchantName(String merchantName)
/* 22:   */   {
/* 23:40 */     this.merchantName = merchantName;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String getMerchantName()
/* 27:   */   {
/* 28:43 */     return this.merchantName;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setMerchantPid(String merchantPid)
/* 32:   */   {
/* 33:47 */     this.merchantPid = merchantPid;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public String getMerchantPid()
/* 37:   */   {
/* 38:50 */     return this.merchantPid;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void setShopinfos(List<ShopEquipmentBindInfo> shopinfos)
/* 42:   */   {
/* 43:54 */     this.shopinfos = shopinfos;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public List<ShopEquipmentBindInfo> getShopinfos()
/* 47:   */   {
/* 48:57 */     return this.shopinfos;
/* 49:   */   }
/* 50:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineSaleleadsMerchantEquipmentQueryResponse
 * JD-Core Version:    0.7.0.1
 */