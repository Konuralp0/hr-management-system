import React from 'react'
import { MenuMenu, MenuItem, MenuHeader, Menu } from 'semantic-ui-react'


export default function Navi() {
  return (
    <div>
      <Menu vertical inverted fixed='top'>
        <MenuItem>
          <MenuHeader>Products</MenuHeader>

          <MenuMenu>
            <MenuItem
              name='enterprise'
            />
            <MenuItem
              name='consumer'
            />
          </MenuMenu>
        </MenuItem>

        <MenuItem>
          <MenuHeader>CMS Solutions</MenuHeader>

          <MenuMenu>
            <MenuItem
              name='rails'
            />
            <MenuItem
              name='python'
            />
            <MenuItem
              name='php'
            />
          </MenuMenu>
        </MenuItem>

        <MenuItem>
          <MenuHeader>Hosting</MenuHeader>

          <MenuMenu>
            <MenuItem
              name='shared'
            />
            <MenuItem
              name='dedicated'
            />
          </MenuMenu>
        </MenuItem>

        <MenuItem>
          <MenuHeader>Support</MenuHeader>

          <MenuMenu>
            <MenuItem
              name='email'
              
            >
              E-mail Support
            </MenuItem>

            <MenuItem
              name='faq'
             
            >
              FAQs
            </MenuItem>
          </MenuMenu>
        </MenuItem>
      </Menu>
    </div>
  )
}
