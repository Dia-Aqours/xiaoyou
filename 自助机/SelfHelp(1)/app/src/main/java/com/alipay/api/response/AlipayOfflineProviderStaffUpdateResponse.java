/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineProviderStaffUpdateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4798846938914693373L;
/* 10:   */   @ApiField("error_msg")
/* 11:   */   private String errorMsg;
/* 12:   */   @ApiField("operate_result")
/* 13:   */   private String operateResult;
/* 14:   */   @ApiField("operate_type")
/* 15:   */   private String operateType;
/* 16:   */   @ApiField("pid")
/* 17:   */   private String pid;
/* 18:   */   @ApiField("staff_id")
/* 19:   */   private String staffId;
/* 20:   */   
/* 21:   */   public void setErrorMsg(String errorMsg)
/* 22:   */   {
/* 23:48 */     this.errorMsg = errorMsg;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String getErrorMsg()
/* 27:   */   {
/* 28:51 */     return this.errorMsg;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setOperateResult(String operateResult)
/* 32:   */   {
/* 33:55 */     this.operateResult = operateResult;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public String getOperateResult()
/* 37:   */   {
/* 38:58 */     return this.operateResult;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void setOperateType(String operateType)
/* 42:   */   {
/* 43:62 */     this.operateType = operateType;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public String getOperateType()
/* 47:   */   {
/* 48:65 */     return this.operateType;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void setPid(String pid)
/* 52:   */   {
/* 53:69 */     this.pid = pid;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public String getPid()
/* 57:   */   {
/* 58:72 */     return this.pid;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public void setStaffId(String staffId)
/* 62:   */   {
/* 63:76 */     this.staffId = staffId;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public String getStaffId()
/* 67:   */   {
/* 68:79 */     return this.staffId;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineProviderStaffUpdateResponse
 * JD-Core Version:    0.7.0.1
 */