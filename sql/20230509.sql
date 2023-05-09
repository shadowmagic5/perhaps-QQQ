-- 粕等 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('論僇', '3', '1', 'phase', 'system/phase/index', 1, 0, 'C', '0', '0', 'system:phase:list', '#', 'admin', getdate(), '', null, '論僇粕等');

---- 偌聽虜粕等ID
--SELECT @parentId := LAST_INSERT_ID();

declare @parentId int;
-- 偌聽虜粕等ID
SELECT * INTO #TMP FROM (select parentId = @@IDENTITY) T ;
SELECT parentId FROM #TMP;

-- 偌聽 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('論僇脤戙', (SELECT parentId FROM #TMP), '1',  '#', '', 1, 0, 'F', '0', '0', 'system:phase:query',        '#', 'admin', getdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('論僇陔崝', (SELECT parentId FROM #TMP), '2',  '#', '', 1, 0, 'F', '0', '0', 'system:phase:add',          '#', 'admin', getdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('論僇党蜊', (SELECT parentId FROM #TMP), '3',  '#', '', 1, 0, 'F', '0', '0', 'system:phase:edit',         '#', 'admin', getdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('論僇刉壺', (SELECT parentId FROM #TMP), '4',  '#', '', 1, 0, 'F', '0', '0', 'system:phase:remove',       '#', 'admin', getdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('論僇絳堤', (SELECT parentId FROM #TMP), '5',  '#', '', 1, 0, 'F', '0', '0', 'system:phase:export',       '#', 'admin', getdate(), '', null, '');
