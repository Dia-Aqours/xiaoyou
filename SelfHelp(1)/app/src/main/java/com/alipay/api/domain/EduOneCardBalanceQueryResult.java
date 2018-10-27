/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import java.util.Date;
/*  6:   */ 
/*  7:   */ public class EduOneCardBalanceQueryResult
/*  8:   */   extends AlipayObject
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 4362381741763261163L;
/* 11:   */   @ApiField("agent_code")
/* 12:   */   private String agentCode;
/* 13:   */   @ApiField("balance")
/* 14:   */   private String balance;
/* 15:   */   @ApiField("card_name")
/* 16:   */   private String cardName;
/* 17:   */   @ApiField("card_no")
/* 18:   */   private String cardNo;
/* 19:   */   @ApiField("last_update_time")
/* 20:   */   private Date lastUpdateTime;
/* 21:   */   @ApiField("pound_amount")
/* 22:   */   private String poundAmount;
/* 23:   */   
/* 24:   */   public String getAgentCode()
/* 25:   */   {
/* 26:55 */     return this.agentCode;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setAgentCode(String agentCode)
/* 30:   */   {
/* 31:58 */     this.agentCode = agentCode;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getBalance()
/* 35:   */   {
/* 36:62 */     return this.balance;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setBalance(String balance)
/* 40:   */   {
/* 41:65 */     this.balance = balance;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String getCardName()
/* 45:   */   {
/* 46:69 */     return this.cardName;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setCardName(String cardName)
/* 50:   */   {
/* 51:72 */     this.cardName = cardName;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public String getCardNo()
/* 55:   */   {
/* 56:76 */     return this.cardNo;
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void setCardNo(String cardNo)
/* 60:   */   {
/* 61:79 */     this.cardNo = cardNo;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public Date getLastUpdateTime()
/* 65:   */   {
/* 66:83 */     return this.lastUpdateTime;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public void setLastUpdateTime(Date lastUpdateTime)
/* 70:   */   {
/* 71:86 */     this.lastUpdateTime = lastUpdateTime;
/* 72:   */   }
/* 73:   */   
/* 74:   */   public String getPoundAmount()
/* 75:   */   {
/* 76:90 */     return this.poundAmount;
/* 77:   */   }
/* 78:   */   
/* 79:   */   public void setPoundAmount(String poundAmount)
/* 80:   */   {
/* 81:93 */     this.poundAmount = poundAmount;
/* 82:   */   }
/* 83:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.EduOneCardBalanceQueryResult
 * JD-Core Version:    0.7.0.1
 */