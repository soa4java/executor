Executor Provider and Executor API communicate with Executor Protocol.

Protocol version|Command Type|Args Length|Command Args
8位，8位，32位，动态

Register: 113das (1 means protocol version, 1 means Register, 3 means args length, 'das' is the command args)
Initialize: 1244ip=192.168.83.130&machine=kevin&mem=8000 (1 means protocol version, 2 means initialize, 
					44 means args length, others means machine infor)
Heartbeat: 130 (3 means Heartbeat, 0 means no data)
Heartbeat with statistics: 13812600610 (1 means protocol version, 3 means Heartbeat, 8 means args length, 
					12 means machine cpu of 12%, 60 means machine memory 60%, 
					06 means current process cpu 6%, 10 means current process memory 10%)
