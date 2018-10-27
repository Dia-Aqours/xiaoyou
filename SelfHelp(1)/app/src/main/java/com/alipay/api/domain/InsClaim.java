/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class InsClaim
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 3316586131577855345L;
/*  13:    */   @ApiField("biz_data")
/*  14:    */   private String bizData;
/*  15:    */   @ApiField("claim_fee")
/*  16:    */   private Long claimFee;
/*  17:    */   @ApiField("claim_no")
/*  18:    */   private String claimNo;
/*  19:    */   @ApiField("claim_pay_time")
/*  20:    */   private Date claimPayTime;
/*  21:    */   @ApiListField("claim_progress")
/*  22:    */   @ApiField("claim_progress")
/*  23:    */   private List<ClaimProgress> claimProgress;
/*  24:    */   @ApiField("claim_status")
/*  25:    */   private String claimStatus;
/*  26:    */   @ApiField("out_request_no")
/*  27:    */   private String outRequestNo;
/*  28:    */   
/*  29:    */   public String getBizData()
/*  30:    */   {
/*  31: 64 */     return this.bizData;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setBizData(String bizData)
/*  35:    */   {
/*  36: 67 */     this.bizData = bizData;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public Long getClaimFee()
/*  40:    */   {
/*  41: 71 */     return this.claimFee;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setClaimFee(Long claimFee)
/*  45:    */   {
/*  46: 74 */     this.claimFee = claimFee;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getClaimNo()
/*  50:    */   {
/*  51: 78 */     return this.claimNo;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setClaimNo(String claimNo)
/*  55:    */   {
/*  56: 81 */     this.claimNo = claimNo;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public Date getClaimPayTime()
/*  60:    */   {
/*  61: 85 */     return this.claimPayTime;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setClaimPayTime(Date claimPayTime)
/*  65:    */   {
/*  66: 88 */     this.claimPayTime = claimPayTime;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public List<ClaimProgress> getClaimProgress()
/*  70:    */   {
/*  71: 92 */     return this.claimProgress;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setClaimProgress(List<ClaimProgress> claimProgress)
/*  75:    */   {
/*  76: 95 */     this.claimProgress = claimProgress;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getClaimStatus()
/*  80:    */   {
/*  81: 99 */     return this.claimStatus;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setClaimStatus(String claimStatus)
/*  85:    */   {
/*  86:102 */     this.claimStatus = claimStatus;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getOutRequestNo()
/*  90:    */   {
/*  91:106 */     return this.outRequestNo;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setOutRequestNo(String outRequestNo)
/*  95:    */   {
/*  96:109 */     this.outRequestNo = outRequestNo;
/*  97:    */   }
/*  98:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InsClaim
 * JD-Core Version:    0.7.0.1
 */