package io.digdag.standards.command;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Scopes;
import io.digdag.spi.CommandExecutor;
import io.digdag.standards.command.SimpleCommandExecutor;
import io.digdag.standards.command.DockerCommandExecutor;

public class CommandExecutorModule
    implements Module
{
    @Override
    public void configure(Binder binder)
    {
        //binder.bind(CommandExecutor.class).to(SimpleCommandExecutor.class).in(Scopes.SINGLETON);
        binder.bind(CommandExecutor.class).to(DockerCommandExecutor.class).in(Scopes.SINGLETON);
        binder.bind(SimpleCommandExecutor.class).in(Scopes.SINGLETON);
    }
}
