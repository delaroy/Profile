package com.delaroystudios.profile

class ProfileDataSource{

    companion object{

        fun createDataSet(): ArrayList<ProfileItems>{
            val list = ArrayList<ProfileItems>()
            list.add(
                ProfileItems(
                    R.drawable.pr1
                )
            )
            list.add(
                ProfileItems(
                    R.drawable.pr2
                )
            )
            list.add(
                ProfileItems(
                    R.drawable.pr3
                )
            )

            list.add(
                ProfileItems(
                    R.drawable.pr4
                )
            )
            list.add(
                ProfileItems(
                    R.drawable.pr5
                )
            )
            list.add(
                ProfileItems(
                    R.drawable.pr6
                )
            )
            list.add(
                ProfileItems(
                    R.drawable.pr2
                )
            )
            list.add(
                ProfileItems(
                    R.drawable.pr1
                )
            )
            return list
        }
    }
}