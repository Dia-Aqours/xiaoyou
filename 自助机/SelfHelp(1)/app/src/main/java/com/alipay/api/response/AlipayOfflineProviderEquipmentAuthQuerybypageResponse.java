/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.EquipmentAuthRemoveQueryBypageDTO;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayOfflineProviderEquipmentAuthQuerybypageResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 1263859221251467546L;
/* 13:   */   @ApiListField("equipmentauthremovequerybypagelist")
/* 14:   */   @ApiField("equipment_auth_remove_query_bypage_d_t_o")
/* 15:   */   private List<EquipmentAuthRemoveQueryBypageDTO> equipmentauthremovequerybypagelist;
/* 16:   */   @ApiField("total")
/* 17:   */   private Long total;
/* 18:   */   
/* 19:   */   public void setEquipmentauthremovequerybypagelist(List<EquipmentAuthRemoveQueryBypageDTO> equipmentauthremovequerybypagelist)
/* 20:   */   {
/* 21:34 */     this.equipmentauthremovequerybypagelist = equipmentauthremovequerybypagelist;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public List<EquipmentAuthRemoveQueryBypageDTO> getEquipmentauthremovequerybypagelist()
/* 25:   */   {
/* 26:37 */     return this.equipmentauthremovequerybypagelist;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setTotal(Long total)
/* 30:   */   {
/* 31:41 */     this.total = total;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public Long getTotal()
/* 35:   */   {
/* 36:44 */     return this.total;
/* 37:   */   }
/* 38:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineProviderEquipmentAuthQuerybypageResponse
 * JD-Core Version:    0.7.0.1
 */