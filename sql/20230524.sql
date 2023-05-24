USE [ruoyi]
GO

/****** Object:  Table [dbo].[dd_ask]    Script Date: 2023/5/24 15:30:03 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[dd_ask](
	[ASK_ID] [BIGINT] IDENTITY(100,1) NOT NULL,
	[create_by] [NVARCHAR](64) NULL,
	[create_time] [DATETIME2](0) NULL,
	[update_by] [NVARCHAR](64) NULL,
	[update_time] [DATETIME2](0) NULL,
	[status] [NCHAR](1) NULL,
	[phase_id] [BIGINT] NULL,
	[question] [NVARCHAR](255) NULL,
	[online_type] [BIGINT] NULL,
 CONSTRAINT [PK_dd_ask] PRIMARY KEY CLUSTERED 
(
	[ASK_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
 CONSTRAINT [UNI_dd_ask] UNIQUE NONCLUSTERED 
(
	[question] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'ID' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'dd_ask', @level2type=N'COLUMN',@level2name=N'ASK_ID'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'dd_ask', @level2type=N'COLUMN',@level2name=N'create_by'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'dd_ask', @level2type=N'COLUMN',@level2name=N'create_time'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'dd_ask', @level2type=N'COLUMN',@level2name=N'update_by'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'dd_ask', @level2type=N'COLUMN',@level2name=N'update_time'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'dd_ask', @level2type=N'COLUMN',@level2name=N'status'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'阶段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'dd_ask', @level2type=N'COLUMN',@level2name=N'phase_id'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'问题' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'dd_ask', @level2type=N'COLUMN',@level2name=N'question'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'线上类型' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'dd_ask', @level2type=N'COLUMN',@level2name=N'online_type'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'应答表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'dd_ask'
GO


