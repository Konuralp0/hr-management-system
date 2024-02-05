import React from 'react'
import { MenuMenu, MenuItem, MenuHeader, Menu } from 'semantic-ui-react'


export default function Navi() {
  return (
    <div>
      <Menu inverted fixed='top' widths={11} >
        <MenuItem>
          <MenuHeader>Job Seekers</MenuHeader>
        </MenuItem>

        <MenuItem>
          <MenuHeader>Employers</MenuHeader>
        </MenuItem>

        <MenuItem>
          <MenuHeader>Job Positions</MenuHeader>
        </MenuItem>

        <MenuItem>
          <MenuHeader>Support</MenuHeader>
        </MenuItem>
      </Menu>
    </div>
  )
}
