/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class EduOneCardDepositCardQueryResult
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 1334347523641165384L;
/*  11:    */   @ApiField("agent_code")
/*  12:    */   private String agentCode;
/*  13:    */   @ApiField("agent_name")
/*  14:    */   private String agentName;
/*  15:    */   @ApiField("balance")
/*  16:    */   private String balance;
/*  17:    */   @ApiField("card_name")
/*  18:    */   private String cardName;
/*  19:    */   @ApiField("card_no")
/*  20:    */   private String cardNo;
/*  21:    */   @ApiField("last_update_time")
/*  22:    */   private Date lastUpdateTime;
/*  23:    */   @ApiField("pound_amount")
/*  24:    */   private String poundAmount;
/*  25:    */   
/*  26:    */   public String getAgentCode()
/*  27:    */   {
/*  28: 61 */     return this.agentCode;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void setAgentCode(String agentCode)
/*  32:    */   {
/*  33: 64 */     this.agentCode = agentCode;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public String getAgentName()
/*  37:    */   {
/*  38: 68 */     return this.agentName;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void setAgentName(String agentName)
/*  42:    */   {
/*  43: 71 */     this.agentName = agentName;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public String getBalance()
/*  47:    */   {
/*  48: 75 */     return this.balance;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setBalance(String balance)
/*  52:    */   {
/*  53: 78 */     this.balance = balance;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public String getCardName()
/*  57:    */   {
/*  58: 82 */     return this.cardName;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setCardName(String cardName)
/*  62:    */   {
/*  63: 85 */     this.cardName = cardName;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public String getCardNo()
/*  67:    */   {
/*  68: 89 */     return this.cardNo;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setCardNo(String cardNo)
/*  72:    */   {
/*  73: 92 */     this.cardNo = cardNo;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public Date getLastUpdateTime()
/*  77:    */   {
/*  78: 96 */     return this.lastUpdateTime;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setLastUpdateTime(Date lastUpdateTime)
/*  82:    */   {
/*  83: 99 */     this.lastUpdateTime = lastUpdateTime;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getPoundAmount()
/*  87:    */   {
/*  88:103 */     return this.poundAmount;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setPoundAmount(String poundAmount)
/*  92:    */   {
/*  93:106 */     this.poundAmount = poundAmount;
/*  94:    */   }
/*  95:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.EduOneCardDepositCardQueryResult
 * JD-Core Version:    0.7.0.1
 */