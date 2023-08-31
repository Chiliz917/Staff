import request from '@/utils/request'

// 查询职工列表
export function listStaff(query) {
  return request({
    url: '/system/staff/list',
    method: 'get',
    params: query
  })
}

// 查询职工详细
export function getStaff(id) {
  return request({
    url: '/system/staff/' + id,
    method: 'get'
  })
}

// 新增职工
export function addStaff(data) {
  return request({
    url: '/system/staff',
    method: 'post',
    data: data
  })
}

// 修改职工
export function updateStaff(data) {
  return request({
    url: '/system/staff',
    method: 'put',
    data: data
  })
}

// 删除职工
export function delStaff(id) {
  return request({
    url: '/system/staff/' + id,
    method: 'delete'
  })
}
