/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayBossCsChannelQueryResponse
/*   7:    */   extends AlipayResponse
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 5284776463771372263L;
/*  10:    */   @ApiField("att")
/*  11:    */   private String att;
/*  12:    */   @ApiField("comment")
/*  13:    */   private String comment;
/*  14:    */   @ApiField("connection_rate")
/*  15:    */   private String connectionRate;
/*  16:    */   @ApiField("curr_agent_talking")
/*  17:    */   private String currAgentTalking;
/*  18:    */   @ApiField("curr_agents_logged_in")
/*  19:    */   private String currAgentsLoggedIn;
/*  20:    */   @ApiField("curr_number_waiting_calls")
/*  21:    */   private String currNumberWaitingCalls;
/*  22:    */   @ApiField("current_not_ready_agents")
/*  23:    */   private String currentNotReadyAgents;
/*  24:    */   @ApiField("current_ready_agents")
/*  25:    */   private String currentReadyAgents;
/*  26:    */   @ApiField("row_key")
/*  27:    */   private String rowKey;
/*  28:    */   @ApiField("visitor_inflow")
/*  29:    */   private String visitorInflow;
/*  30:    */   @ApiField("visitor_response")
/*  31:    */   private String visitorResponse;
/*  32:    */   @ApiField("visitor_response_transfer")
/*  33:    */   private String visitorResponseTransfer;
/*  34:    */   
/*  35:    */   public void setAtt(String att)
/*  36:    */   {
/*  37: 90 */     this.att = att;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getAtt()
/*  41:    */   {
/*  42: 93 */     return this.att;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setComment(String comment)
/*  46:    */   {
/*  47: 97 */     this.comment = comment;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getComment()
/*  51:    */   {
/*  52:100 */     return this.comment;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setConnectionRate(String connectionRate)
/*  56:    */   {
/*  57:104 */     this.connectionRate = connectionRate;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getConnectionRate()
/*  61:    */   {
/*  62:107 */     return this.connectionRate;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setCurrAgentTalking(String currAgentTalking)
/*  66:    */   {
/*  67:111 */     this.currAgentTalking = currAgentTalking;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getCurrAgentTalking()
/*  71:    */   {
/*  72:114 */     return this.currAgentTalking;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setCurrAgentsLoggedIn(String currAgentsLoggedIn)
/*  76:    */   {
/*  77:118 */     this.currAgentsLoggedIn = currAgentsLoggedIn;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getCurrAgentsLoggedIn()
/*  81:    */   {
/*  82:121 */     return this.currAgentsLoggedIn;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setCurrNumberWaitingCalls(String currNumberWaitingCalls)
/*  86:    */   {
/*  87:125 */     this.currNumberWaitingCalls = currNumberWaitingCalls;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getCurrNumberWaitingCalls()
/*  91:    */   {
/*  92:128 */     return this.currNumberWaitingCalls;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setCurrentNotReadyAgents(String currentNotReadyAgents)
/*  96:    */   {
/*  97:132 */     this.currentNotReadyAgents = currentNotReadyAgents;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getCurrentNotReadyAgents()
/* 101:    */   {
/* 102:135 */     return this.currentNotReadyAgents;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setCurrentReadyAgents(String currentReadyAgents)
/* 106:    */   {
/* 107:139 */     this.currentReadyAgents = currentReadyAgents;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public String getCurrentReadyAgents()
/* 111:    */   {
/* 112:142 */     return this.currentReadyAgents;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setRowKey(String rowKey)
/* 116:    */   {
/* 117:146 */     this.rowKey = rowKey;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public String getRowKey()
/* 121:    */   {
/* 122:149 */     return this.rowKey;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void setVisitorInflow(String visitorInflow)
/* 126:    */   {
/* 127:153 */     this.visitorInflow = visitorInflow;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public String getVisitorInflow()
/* 131:    */   {
/* 132:156 */     return this.visitorInflow;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void setVisitorResponse(String visitorResponse)
/* 136:    */   {
/* 137:160 */     this.visitorResponse = visitorResponse;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public String getVisitorResponse()
/* 141:    */   {
/* 142:163 */     return this.visitorResponse;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void setVisitorResponseTransfer(String visitorResponseTransfer)
/* 146:    */   {
/* 147:167 */     this.visitorResponseTransfer = visitorResponseTransfer;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public String getVisitorResponseTransfer()
/* 151:    */   {
/* 152:170 */     return this.visitorResponseTransfer;
/* 153:    */   }
/* 154:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayBossCsChannelQueryResponse
 * JD-Core Version:    0.7.0.1
 */