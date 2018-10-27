/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ArrangementVORes
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2265984336388336612L;
/* 10:   */   @ApiField("ar_base")
/* 11:   */   private ArrangementBaseVO arBase;
/* 12:   */   @ApiField("ar_bsn_status")
/* 13:   */   private String arBsnStatus;
/* 14:   */   @ApiField("ar_condition")
/* 15:   */   private String arCondition;
/* 16:   */   @ApiField("arrangement_no")
/* 17:   */   private String arrangementNo;
/* 18:   */   
/* 19:   */   public ArrangementBaseVO getArBase()
/* 20:   */   {
/* 21:41 */     return this.arBase;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setArBase(ArrangementBaseVO arBase)
/* 25:   */   {
/* 26:44 */     this.arBase = arBase;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getArBsnStatus()
/* 30:   */   {
/* 31:48 */     return this.arBsnStatus;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setArBsnStatus(String arBsnStatus)
/* 35:   */   {
/* 36:51 */     this.arBsnStatus = arBsnStatus;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getArCondition()
/* 40:   */   {
/* 41:55 */     return this.arCondition;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setArCondition(String arCondition)
/* 45:   */   {
/* 46:58 */     this.arCondition = arCondition;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getArrangementNo()
/* 50:   */   {
/* 51:62 */     return this.arrangementNo;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setArrangementNo(String arrangementNo)
/* 55:   */   {
/* 56:65 */     this.arrangementNo = arrangementNo;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ArrangementVORes
 * JD-Core Version:    0.7.0.1
 */