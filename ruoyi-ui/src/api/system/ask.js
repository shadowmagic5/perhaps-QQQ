import request from '@/utils/request'

// 查询应答列表
export function listAsk(query) {
  return request({
    url: '/system/ask/list',
    method: 'get',
    params: query
  })
}

// 查询应答详细
export function getAsk(createdby) {
  return request({
    url: '/system/ask/' + createdby,
    method: 'get'
  })
}

// 新增应答
export function addAsk(data) {
  return request({
    url: '/system/ask',
    method: 'post',
    data: data
  })
}

// 修改应答
export function updateAsk(data) {
  return request({
    url: '/system/ask',
    method: 'put',
    data: data
  })
}

// 删除应答
export function delAsk(createdby) {
  return request({
    url: '/system/ask/' + createdby,
    method: 'delete'
  })
}
