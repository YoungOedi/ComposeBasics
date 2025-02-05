package de.fred.composedemo1.thirdfeature.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import de.fred.composedemo1.navigation.Navigator
import de.fred.composedemo1.navigation.NavTarget
import de.fred.composedemo1.thirdfeature.ui.ThirdFeatureView
import de.fred.composedemo1.thirdfeature.ui.ThirdFeatureViewModel
import org.koin.androidx.compose.viewModel

fun NavGraphBuilder.addThirdFeatureGraph(popBackStack: () -> Unit) {
    navigation(NavTarget.ThirdFeature.label, NavTarget.ThirdModule.label) {
        composable(NavTarget.ThirdFeature.label) {
            val viewModel: ThirdFeatureViewModel by viewModel()
            ThirdFeatureView(viewModel, popBackStack)
        }
    }
}