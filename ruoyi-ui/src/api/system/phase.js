import request from '@/utils/request'

// 查询阶段列表
export function listPhase(query) {
  return request({
    url: '/system/phase/list',
    method: 'get',
    params: query
  })
}

// 查询阶段详细
export function getPhase(id) {
  return request({
    url: '/system/phase/' + id,
    method: 'get'
  })
}

// 新增阶段
export function addPhase(data) {
  return request({
    url: '/system/phase',
    method: 'post',
    data: data
  })
}

// 修改阶段
export function updatePhase(data) {
  return request({
    url: '/system/phase',
    method: 'put',
    data: data
  })
}

// 删除阶段
export function delPhase(id) {
  return request({
    url: '/system/phase/' + id,
    method: 'delete'
  })
}
